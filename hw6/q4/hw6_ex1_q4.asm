; This simple program simply adds to 32-bit integers together
; and stores the results bac in memory

%include "asm_io.inc"

segment .data
    msg1 db "Enter an integer: ",0
    msg2 db "Binary representation: ", 0
    msg3 db "String representation: ", 0
    msg4 db "Pattern DBB occurs this many times: ",0
    msg5 db "Enter a 2-character pattern: ",0
    msg6 db "Your pattern occurs this many times: ",0
    msg7 db "Enter a pattern with at most 16 characters: ",0
    msg8 db "Your pattern occurs this many times: ",0
    msg9 db "Pattern B+ occurs this many times: ", 0

segment .bss
        inputInt resd 1

segment .text
    global asm_main
asm_main:
    enter   0,0
    pusha

    mov     eax, msg1
    call    print_string
    call    read_int
    mov     [inputInt], eax
    call    read_char

    mov     eax, msg2
    call    print_string
    xor     ebx, ebx                    ;Zero out ebx
    xor     ecx, ecx                    ;Zero out ecx
    mov     cl, 32
    mov     ebx, [inputInt]             ;Store input integer into ebx

start_bin_rep_loop:
    sal     ebx, 1                      ;Shift ebx left
    jnc     no_carry

    jc      yes_carry

no_carry:
    mov     eax, 0
    call    print_int
    jmp     finish_carry

yes_carry:
    mov     eax, 1
    call    print_int

finish_carry:
    dec     cl
    jnz     start_bin_rep_loop

    call    print_nl
    mov     eax, msg3
    call    print_string
    xor     ebx, ebx                    ;Zero out ebx
    xor     ecx, ecx                    ;Zero out ecx
    mov     cl, 16
    mov     ebx, [inputInt]             ;Store input integer into ebx

start_str_rep_loop:
    mov     ch, 0
    sal     ebx, 1                      ;Shift ebx left
    jnc     first_bit_carry_no
    inc     ch

first_bit_carry_no:
    sal     ebx, 1
    jnc     second_bit_carry_no
    add     ch, 2

second_bit_carry_no:
    cmp     ch, 0
    je      char_a

    cmp     ch, 1
    je      char_c

    cmp     ch, 2
    je      char_b

    cmp     ch, 3
    je      char_d

char_a:
    mov     al, 041h
    call    print_char
    jmp     finish_printing

char_b:
    mov     al, 042h
    call    print_char
    jmp     finish_printing

char_c:
    mov     al, 043h
    call    print_char
    jmp     finish_printing

char_d:
    mov     al, 044h
    call    print_char
    jmp     finish_printing

finish_printing:
    dec     cl
    jnz     start_str_rep_loop

    call    print_nl
    mov     eax, msg4
    call    print_string
    xor     eax, eax                    ;Zero out eax
    xor     ebx, ebx                    ;Zero out ebx
    xor     ecx, ecx                    ;Zero out ecx
    xor     edx, edx                    ;Zero out edx
    xor     esi, esi                    ;Zero out esi
    xor     edi, edi                    ;Zero out edi
    mov     eax, 0                      ;Eax is count for dbb matches
    mov     edi, 53                     ;Edi is DBB comparison
    mov     dh, 0                       ;Dh is shifts to the left
    mov     dl, 26                      ;Dl is shifts to the right
    mov     esi, 14                     ;Esi is my counter for the loop

start_dbb:
    mov     ebx, [inputInt]             ;Store input integer into ebx
    mov     cl, dh
    shl     ebx, cl
    mov     cl, dl
    shr     ebx, cl
    cmp     edi, ebx
    jne     not_dbb

    inc     eax

not_dbb:
    add     dh, 2
    dec     esi
    jnz     start_dbb

    call    print_int
    call    print_nl
    mov     eax, msg5
    call    print_string
    xor     eax, eax                    ;Zero out eax
    xor     ebx, ebx                    ;Zero out ebx
    xor     ecx, ecx                    ;Zero out ecx
    xor     edx, edx                    ;Zero out edx
    xor     esi, esi                    ;Zero out esi
    xor     edi, edi                    ;Zero out edi
    mov     cl, 32                      ;Cl is shifts to the right

start_two_char_input:                   ;Start user input loop
    call    read_char
    cmp     al, 00Ah                    ;Check if input is newline
    je      newline_input

    cmp     al, 041h
    je      char_a_two

    cmp     al, 042h
    je      char_b_two

    cmp     al, 043h
    je      char_c_two

    cmp     al, 044h
    je      char_d_two

char_a_two:
    shl     edi, 2
    sub     cl, 2
    jmp     finish_read_char

char_b_two:
    shl     edi, 2
    inc     edi
    sub     cl, 2
    jmp     finish_read_char

char_c_two:
    shl     edi, 1
    inc     edi
    shl     edi, 1
    sub     cl, 2
    jmp     finish_read_char

char_d_two:
    shl     edi, 1
    inc     edi
    shl     edi, 1
    inc     edi
    sub     cl, 2
    jmp     finish_read_char

finish_read_char:

newline_input:
    cmp     al, 00Ah                    ;Check if input is newline
    jne     start_two_char_input

    movzx   eax, cl
    mov     ch, 2
    div     ch
    movzx   esi, al
    inc     esi
    mov     dl, cl

    mov     eax, msg6
    call    print_string
    xor     eax, eax                    ;Eax is count for matches
    mov     dh, 0                       ;Dh is shifts to the left

start_two_char:
    mov     ebx, [inputInt]             ;Store input integer into ebx
    mov     cl, dh
    shl     ebx, cl
    mov     cl, dl
    shr     ebx, cl
    cmp     edi, ebx
    jne     not_two_char

    inc     eax

not_two_char:
    add     dh, 2
    dec     esi
    jnz     start_two_char

    call    print_int
    call    print_nl

    popa
    mov eax, 0
    leave
    ret
