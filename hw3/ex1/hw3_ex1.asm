; This simple program simply adds to 32-bit integers together
; and stores the results bac in memory

%include "asm_io.inc"

segment .data
	msg1		db		"First '",0
	msg2		db		"' was entered and then '",0
	msg3		db		"' was entered",0

segment .bss
	sum1		resb	1
	sum2		resb	1

segment .text
	global asm_main
asm_main:
	enter	0,0
	pusha

	call		read_char
	mov			[sum1], al
	call		read_char
	call		read_char
	mov			[sum2], al
	call		read_char
	mov			eax, msg1
	call		print_string
	mov			eax, [sum1]
	call		print_char
	mov			eax, msg2
	call		print_string
	mov			eax, [sum2]
	call		print_char
	mov			eax, msg3
	call		print_string
	call		print_nl

	popa
	mov	eax, 0
	leave
	ret

