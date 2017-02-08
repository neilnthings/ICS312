; This simple program simply adds to 32-bit integers together
; and stores the results bac in memory

%include "asm_io.inc"

segment .data
	msg1		db		"Enter a string with 4 upper case letters: ",0
	msg2		db		"Enter an integer between 1 and 30: ",0
	msg3		db		"String #1: ",0
	msg4		db		"String #2: ",0

segment .bss
	chara1		resb	1
	chara2		resb	1
	chara3		resb	1
	chara4		resb	1
	inputInt	resw	1

segment .text
	global asm_main
asm_main:
	enter	0,0
	pusha

	mov			eax, msg1
	call		print_string			;print msg1
	call		read_char				;first user input
	mov			[chara1], al
	call		read_char				;second user input
	mov			[chara2], al
	call		read_char				;third user input
	mov			[chara3], al
	call		read_char				;fourth user input
	mov			[chara4], al
	call		read_char				;takes carriage return
	mov			eax, msg2
	call		print_string			;print msg2
	call		read_int				;integer input
	mov			[inputInt], eax
	call		read_char				;takes carriage return
	mov			eax, msg3
	call		print_string			;print msg3
	mov			eax, [chara4]
	call		print_char
	mov			eax, [chara3]
	call		print_char
	mov			eax, [chara2]
	call		print_char
	mov			eax, [chara1]
	call		print_char
	call		print_nl
	mov			eax, msg4
	call		print_string			;print msg4
	mov			bx, [inputInt]
	sub			[chara1], bx
	mov			al, [chara1]
	call		print_char
	mov			al, [chara1]
	call		print_char
	sub			[chara2], bx
	mov			al, [chara2]
	call		print_char
	mov			al, [chara2]
	call		print_char
	sub			[chara3], bx
	mov			al, [chara3]
	call		print_char
	mov			al, [chara3]
	call		print_char
	sub			[chara4], bx
	mov			al, [chara4]
	call		print_char
	mov			al, [chara4]
	call		print_char
	call		print_nl

	popa
	mov	eax, 0
	leave
	ret

