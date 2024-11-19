def fib_row(dec_num): 
    arr = [1, 1] 

    while arr[-1] <= dec_num: 
        arr.append(arr[len(arr)-1] + arr[len(arr)-2]) 

    return arr[1 : len(arr) -1] 

def convert_dec_to_fib(dec_num, fib_arr):  
    if len(fib_arr) == 0 or dec_num < 0: 
        return 
        
    el_fib = fib_arr[len(fib)-1] 

    if el_fib > dec_num: 
        print("0", end = '') 
    else: 
        print("1", end = '') 
        dec_num -= el_fib  
    fib_arr.pop(len(fib) - 1)  

    convert_dec_to_fib(dec_num, fib_arr) 

dec_num = int(input("Введите число в десятичной системе счисления: "))  
fib = fib_row(dec_num)  
convert_dec_to_fib(dec_num, fib)  
