%include "asm_io.inc"

segment .data
    message         db      "Enter the bin size: ",0
    invalidMsg      db      "Invalid bin size, aborting!",0
    validMsg        db      "Valid bin size!",0
    message2        db      "The total number of bins is: ",0
    message3        db      "List of bins:",0
    binContent      db      " 'xx'",0
    message4        db      "Enter a long string: ",0
    binDisplay      db      "Bin 'xx': ",0

segment .bss
    binSize         resb    1
    binCount        resb    1
    binArray        resb    95
    binLimits       resb    181
    remainder       resb    1
    binArrayCount   resb    1

segment .text
    global asm_main
asm_main:
    enter   0,0
    pusha

    mov     eax, message
    call    print_string
    call    read_int                ;Take user input
    mov     ebx, eax                ;Store user input into 'ebx'
    mov     [binSize], bl           ;Store user input into 'binSize'
    call    read_char

    cmp     ebx, 0
    jle     invalid
    cmp     ebx, 95
    jg      invalid                 ;ASK PROF ABOUT MIXING SIGNED, UNSIGNED BRANCES

    jmp     valid                   ;If valid input skip invalid section

invalid:
    mov     eax, invalidMsg
    call    print_string
    call    print_nl
    jmp     invalid_user_input      ;If invalid input terminate program

valid:
    mov     eax, validMsg
    call    print_string
    call    print_nl

    mov     eax, 95                 ;********START OF EXERCISE 2********
    div     bl
    mov     cl, al                  ;Storing quotient into 'cl'
    mov     ch, ah                  ;Storing remainder into 'ch'
    mov     [remainder], ah         ;Storing remainder into 'remainder'
    mov     eax, message2
    call    print_string
    cmp     ch, 0                   ;Comparing the remainder to 0
    je      no_remainder_exist      ;If there is no remainder skip next line
    inc     cl                      ;If there is a remainder increment 'cl'

no_remainder_exist:
    movzx   eax, cl                 ;Move the quotient to eax for printing
    call    print_int
    call    print_nl

    mov     [binCount], cl          ;********START OF EXERCISE 3********
    mov     bh, [binSize]           ;Store bin size into 'bh'
    dec     bh                      ;Decrementing 'bh' for start_bin_loop
    mov     eax, message3
    call    print_string
    mov     bl, 01Fh
    mov     eax, binContent
    dec     cl
    cmp     byte [binSize], 95
    je      input_95

    mov     edx, binLimits          ;Moving address of bin limits to 'edx'

start_bin_loop:
    inc     bl
    add     eax, 2
    mov     [eax], bl
    mov     [edx], bl               ;Storing first bin limit of two
    add     edx, 1                  ;Incrementing 'edx'
    add     bl, bh
    inc     eax
    mov     [eax], bl
    mov     [edx], bl               ;Storing second bin limit of two
    inc     edx                     ;Incrementing 'edx'
    sub     eax, 3
    call    print_string
    dec     cl
    jnz     start_bin_loop          ;End of start_bin_loop
    
    cmp     byte [binSize], 1
    je      input_1

    dec     ch
    mov     eax, binContent
    inc     bl
    add     eax, 2
    mov     [eax], bl
    mov     [edx], bl               ;Storing first bin limit of two
    add     edx, 1                  ;Incrementing 'edx'
    add     bl, ch
    inc     eax
    mov     [eax], bl
    mov     [edx], bl               ;Storing second bin limit of two
    inc     edx                     ;Incrementing 'edx'
    sub     eax, 3
    call    print_string
    call    print_nl
    jmp     not_input_95

input_1:                            ;If input is 1
    inc     bl
    add     eax, 2
    mov     [eax], bl
    mov     [edx], bl               ;Storing first bin limit of two
    add     edx, 1                  ;Incrementing 'edx'
    inc     eax
    mov     [eax], bl
    mov     [edx], bl               ;Storing second bin limit of two
    inc     edx                     ;Incrementing 'edx'
    sub     eax, 3
    call    print_string
    call    print_nl
    jmp     not_input_95

input_95:                           ;If input is 95
    inc     bl
    add     eax, 2
    mov     [eax], bl
    mov     [edx], bl               ;Storing first bin limit of two
    add     edx, 1                  ;Incrementing 'edx'
    add     bl, bh
    inc     eax
    mov     [eax], bl
    mov     [edx], bl               ;Storing second bin limit of two
    inc     edx                     ;Incrementing 'edx'
    sub     eax, 3
    call    print_string
    call    print_nl

not_input_95:

    mov     byte [edx], 0           ;********START OF EXERCISE 4********
    sub     edx, [binCount]
    sub     edx, [binCount]
    ;mov     eax, edx               ;test-DELETE
    ;call    print_string           ;test-DELETE
    ;call    print_nl               ;test-DELETE
    mov     eax, message4
    call    print_string
    mov     eax, 0
    mov     bl, 00Ah                ;Storing new line into 'bl'
    mov     ecx, binArray

start_user_input_loop:              ;Start user input loop
    mov     edx, binLimits
    call    read_char

start_cmp_loop:                     ;Start compare loop
    cmp     al, bl                  ;Check if input is newline
    je      newline_input
    cmp     byte [binSize], 95
    je      bin_input_95
    cmp     al, [edx]               ;Check if input is less than lower limit
    jb      outside_bin_limit
    inc     edx
    cmp     al, [edx]               ;Check if input is more than upper limit
    ja      outside_bin_limit
    jmp     inside_bin_limit
outside_bin_limit:
    inc     edx
    jmp start_cmp_loop
inside_bin_limit:
bin_input_95:
    ;call    print_char

newline_input:
    cmp     al, bl
    jne     start_user_input_loop

invalid_user_input:

    popa
    mov eax, 0
    leave
    ret
