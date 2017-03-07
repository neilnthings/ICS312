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

	mov eax, msg1
	call print_string
	call read_int
	mov [inputInt], eax
	call read_char

	mov eax, msg2
	call print_string

	xor ebx, ebx
	xor ecx, ecx
	mov bl, 32
	mov ecx, [inputInt]

start_bin_rep_loop:
	sal ecx, 1
	jnc no_carry

	jc yes_carry

no_carry:
	mov eax, 0
	call print_int
	jmp finish_carry

yes_carry:
	mov eax, 1
	call print_int

finish_carry:

	dec bl
	jnz start_bin_rep_loop

	call print_nl

	popa
	mov	eax, 0
	leave
	ret
