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
	enter	0,0
	pusha

	mov 	eax, msg1
	call	print_string
	call	read_int
	mov 	[inputInt], eax
	call	read_char

	mov 	eax, msg2
	call	print_string
	xor 	ebx, ebx 					;Zero out ebx
	xor 	ecx, ecx					;Zero out ecx
	mov 	cl, 32
	mov 	ebx, [inputInt] 			;Store input integer into ebx

start_bin_rep_loop:
	sal 	ebx, 1						;Shift ebx left
	jnc 	no_carry

	jc 		yes_carry

no_carry:
	mov 	eax, 0
	call	print_int
	jmp 	finish_carry

yes_carry:
	mov 	eax, 1
	call	print_int

finish_carry:
	dec 	cl
	jnz 	start_bin_rep_loop

	call	print_nl
	mov 	eax, msg3
	call	print_string
	xor 	ebx, ebx 					;Zero out ebx
	xor 	ecx, ecx					;Zero out ecx
	mov 	cl, 16
	mov 	ebx, [inputInt] 			;Store input integer into ebx

start_str_rep_loop:
	mov 	ch, 0
	sal 	ebx, 1						;Shift ebx left
	jnc		first_bit_carry_no
	inc 	ch

first_bit_carry_no:
	sal 	ebx, 1
	jnc 	second_bit_carry_no
	add 	ch, 2

second_bit_carry_no:
	cmp 	ch, 0
	je 		char_a

	cmp		ch, 1
	je 		char_c

	cmp 	ch, 2
	je 		char_b

	cmp		ch, 3
	je 		char_d

char_a:
	mov 	al, 041h
	call 	print_char
	jmp		finish_printing

char_b:
	mov 	al, 042h
	call 	print_char
	jmp		finish_printing

char_c:
	mov 	al, 043h
	call 	print_char
	jmp		finish_printing

char_d:
	mov 	al, 044h
	call 	print_char
	jmp		finish_printing

finish_printing:
	dec 	cl
	jnz 	start_str_rep_loop

	call 	print_nl

	popa
	mov	eax, 0
	leave
	ret
