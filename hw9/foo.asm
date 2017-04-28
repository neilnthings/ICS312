%include "asm_io.inc"
segment .data
	a  dd 2
	b  dd 3
	c  dd 0
segment .text
	global asm_main
asm_main:
	enter 0,0
	pusha
	mov eax,[a]
	add eax,[b]
	mov [c], eax
	mov eax, [a]
	call print_int
	mov al, 02Ch
	call print_char
	mov al, 020h
	call print_char
	mov eax, 12
	call print_int
	mov al, 02Ch
	call print_char
	mov al, 020h
	call print_char
	mov eax, [c]
	call print_int
	call print_nl
	popa
	mov eax,0
	leave
	ret
