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
    binDisplay95    db      "Bin ' ~': ",0
    binArray        times 95    db  "0"
    spaces          db      "   ",0
    hashes          db      " ##",0

segment .bss
    binSize         resb    1
    binCount        resb    1
    binLimits       resb    181
    remainder       resb    1
    binTotals       resb    1
    maxBinTotal     resb    1

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
                                    ;********START OF EXERCISE 3********
    mov     [binCount], cl          ;Store bin count 'cl' into binCount
    mov     bh, [binSize]           ;Store bin size into 'bh'
    dec     bh                      ;Decrementing 'bh' for start_bin_loop
    mov     eax, message3
    call    print_string
    mov     bl, 01Fh
    mov     eax, binContent         ;Storing bin content into 'eax'
    dec     cl
    cmp     byte [binSize], 95      ;Check if input is 95
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
    
    cmp     byte [binSize], 1       ;Check if input is 1
    je      input_1

    cmp     byte [binSize], 5       ;Check if input is 5
    jne     bin_size_not_five
    mov     ch, 5
    
bin_size_not_five:
    cmp     byte [binSize], 19      ;Check if input is 19
    jne     bin_size_not_19
    mov     ch, 19

bin_size_not_19:
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
    mov     eax, message4
    call    print_string
    mov     eax, 0
    mov     bl, 00Ah                ;Storing new line into 'bl'
    mov     bh, [binCount]

start_user_input_loop:              ;Start user input loop
    mov     edx, binLimits          ;Store bin limits into 'edx'
    mov     ecx, binArray           ;Store bin array into 'ecx'
    call    read_char

start_cmp_loop:                     ;Start compare loop
    cmp     al, bl                  ;Check if input is newline
    je      newline_input
    cmp     byte [binSize], 95      ;Check if bin size is 95
    je      bin_input_95
    cmp     al, [edx]               ;Check if input is less than lower limit
    jb      outside_bin_limit
    inc     edx
    cmp     al, [edx]               ;Check if input is more than upper limit
    ja      outside_bin_limit
    jmp     inside_bin_limit

outside_bin_limit:
    inc     ecx                     ;incrementing bin array
    inc     edx                     ;incrementing bin limits
    jmp start_cmp_loop

inside_bin_limit:
bin_input_95:
    inc     byte [ecx]

newline_input:
    cmp     al, bl
    jne     start_user_input_loop

    mov     ebx, binArray           ;Store bin array into 'ebx'
    mov     edx, binLimits          ;Store bin limits into 'edx'
    mov     ch, [binCount]          ;Store number of bins into 'ch'
    mov     byte [maxBinTotal], 0   ;Setting max bin total to 0

print_bin_displays:
    cmp     byte [binSize], 95      ;Check if bin size is 95
    je      display_95
    mov     cl, [edx]
    mov     eax, binDisplay
    add     eax, 5
    mov     byte [eax], cl
    inc     edx
    mov     cl, [edx]
    inc     eax
    mov     byte [eax], cl
    sub     eax, 6
    inc     edx
    call    print_string
    jmp     not_display_95          ;Skip the display 95 section

display_95:
    mov     eax, binDisplay95
    call    print_string

not_display_95:
    mov byte [binTotals], 0

increment_bin_content:
    cmp     byte [ebx], 030h        ;Check if whats at index is 0
    je      dont_increment_bin_content
    inc     byte [binTotals]
    dec     byte [ebx]
    jmp     increment_bin_content

dont_increment_bin_content:
    inc     ebx
    mov     al, [binTotals]
    cmp al, [maxBinTotal]           ;Check if al is less than max
    jb less_than_max
    mov byte [maxBinTotal], al

less_than_max:
    movzx   eax, al
    call    print_int
    call    print_nl
    dec     ch
    jnz     print_bin_displays

    call    print_nl                ;********START EXTRACREDIT********
    mov     bh, [maxBinTotal]

start_hashes_columns:
    mov     bl, [binCount]

start_hashes_rows:
    
    mov eax, hashes
    call print_string

    dec     bl
    jnz     start_hashes_rows

    call    print_nl
    dec     bh
    jnz     start_hashes_columns

invalid_user_input:

    popa
    mov eax, 0
    leave
    ret
