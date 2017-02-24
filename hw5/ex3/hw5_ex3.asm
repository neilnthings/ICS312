; This simple program simply adds to 32-bit integers together
; and stores the results bac in memory

%include "asm_io.inc"

segment .data
    message         db      "Enter the bin size: ",0
    invalidMsg      db      "Invalid bin size, aborting!",0
    validMsg        db      "Valid bin size!",0
    message2        db      "The total number of bins is: ",0
    message3        db      "List of bins:",0
    binContent      db      " 'xx'",0

segment .bss
    binSize         resb    1
    binCount        resb    1

segment .text
    global asm_main
asm_main:
    enter   0,0
    pusha

    mov     eax, message
    call    print_string
    call    read_int            ;Take user input
    mov     ebx, eax            ;Store user input into 'ebx'
    mov     [binSize], bl       ;Store user input into 'binSize'
    call    read_char

    cmp     ebx, 0
    jle     invalid
    cmp     ebx, 95
    jg      invalid             ;ASK PROF ABOUT MIXING SIGNED, UNSIGNED BR

    jmp     valid               ;If valid input skip invalid section

invalid:
    mov     eax, invalidMsg
    call    print_string
    call    print_nl
    jmp     invalid_user_input  ;If invalid input terminate program

valid:
    mov     eax, validMsg
    call    print_string
    call    print_nl

    mov     eax, 95             ;********START OF EXERCISE 2********
    div     bl
    mov     cl, al              ;Storing quotient into 'cl'
    mov     ch, ah              ;Storing remainder into 'ch'
    mov     eax, message2
    call    print_string
    cmp     ch, 0               ;Comparing the remainder to 0
    je      no_remainder_exist  ;If there is no remainder skip next line
    inc     cl                  ;If there is a remainder increment 'cl'

no_remainder_exist:
    movzx   eax, cl             ;Move the quotient to eax for printing
    call    print_int
    call    print_nl

    mov     [binCount], cl      ;********START OF EXERCISE 3********
    mov     bh, [binSize]       ;Store bin size into 'bh'
    dec     bh                  ;Decrementing 'bh' for start_bin_loop
    mov     eax, message3
    call    print_string
    mov     bl, 01Fh
    mov     eax, binContent
    dec     cl
    cmp     byte [binSize], 95
    je      input_95

start_bin_loop:
    inc     bl
    add     eax, 2
    mov     [eax], bl
    add     bl, bh
    inc     eax
    mov     [eax], bl
    sub     eax, 3
    call    print_string
    dec     cl
    jnz     start_bin_loop      ;End of start_bin_loop
    
    cmp     byte [binSize], 1
    je      input_1

    dec     ch
    mov     eax, binContent
    inc     bl
    add     eax, 2
    mov     [eax], bl
    add     bl, ch
    inc     eax
    mov     [eax], bl
    sub     eax, 3
    call    print_string
    call    print_nl
    jmp     not_input_95

input_1:                        ;If input is 1
    inc     bl
    add     eax, 2
    mov     [eax], bl
    inc     eax
    mov     [eax], bl
    sub     eax, 3
    call    print_string
    call    print_nl
    jmp     not_input_95

input_95:                       ;If input is 95
    inc     bl
    add     eax, 2
    mov     [eax], bl
    add     bl, bh
    inc     eax
    mov     [eax], bl
    sub     eax, 3
    call    print_string
    call    print_nl

not_input_95:

invalid_user_input:

    popa
    mov eax, 0
    leave
    ret
