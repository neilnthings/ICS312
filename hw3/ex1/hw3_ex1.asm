; This simple program simply adds to 32-bit integers together
; and stores the results bac in memory

%include "asm_io.inc"

segment .data
	message		db		"First '0' was entered then '0' was entered",0

segment .bss

segment .text
	global asm_main
asm_main:
	enter	0,0
	pusha

	call read_char
	mov bl, al
	call read_char
	call read_char
	mov cl, al
	call read_char
	mov eax, message
	add eax, 7
	mov [eax], bl
	add eax, 21
	mov [eax], cl
	sub eax, 28
	call print_string
	call print_nl

	popa
	mov	eax, 0
	leave
	ret
