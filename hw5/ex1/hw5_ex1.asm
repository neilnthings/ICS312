; This simple program simply adds to 32-bit integers together
; and stores the results bac in memory

%include "asm_io.inc"

segment .data
	message			db		"Enter the bin size: ",0
	invalidMsg		db		"Invalid bin size, aborting!",0
	validMsg		db		"Valid bin size!",0

segment .bss

segment .text
	global asm_main
asm_main:
	enter	0,0
	pusha

	mov		eax, message
	call	print_string
	call	read_int			;Take user input
	mov		ebx, eax			;Store user input into 'ebx'
	call	read_char

	cmp		ebx, 0
	jle		invalid
	cmp		ebx, 95
	jg		invalid

	jmp		valid

invalid:
	mov eax, invalidMsg
	call	print_string
	call	print_nl
	jmp		end

valid:
	mov		eax, validMsg
	call	print_string
	call	print_nl

end:	

	popa
	mov	eax, 0
	leave
	ret
