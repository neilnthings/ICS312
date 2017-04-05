;; function inputArray
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

segment .data
    inputMsg    db  "Enter a positive integer: ", 0

segment .text

inputArray:
    push    ebp
    mov     ebp, esp
    pusha

    mov     ecx, [ebp+8]
    mov     ebx, [ebp+12]
input_loop:
    mov     eax, inputMsg
    call    print_string
    call    read_int
    mov     [ecx], eax
    add     ecx, 4
    dec     ebx
    jnz     input_loop

    popa
    mov     esp, ebp
    pop     ebp
    ret 


;; function printArray
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

segment .data

segment .text

printArray:
    push    ebp
    mov     ebp, esp
    pusha

    mov     ecx, [ebp+8]
    mov     ebx, [ebp+12]
print_loop:
    mov     al, 32
    call    print_char
    mov     eax, [ecx]
    call    print_int
    add     ecx, 4
    dec     ebx
    jnz     print_loop
    call    print_nl

    popa
    mov     esp, ebp
    pop     ebp
    ret     


;; function map
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

segment .data

segment .text

map:
    push    ebp
    mov     ebp, esp
    pusha

    mov     ecx, [ebp+8]
    mov     ebx, [ebp+12]
map_loop:
    push    dword [ecx]
    call    [ebp+16]
    add     esp, 4
    mov     [ecx], eax
    add     ecx, 4
    dec     ebx
    jnz     map_loop

    popa
    mov     esp, ebp
    pop     ebp
    ret 



;; function mapReduce
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

segment .data
    error_msg_mapReduce db  "Function mapReduce not implemented yet!",10,0

segment .text

mapReduce:
    mov eax, error_msg_mapReduce
    call    print_string
    ret 
