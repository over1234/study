
def is_odd(n):
    if n % 2 == 1 : return True
    else : return False

def is_even(n) :
    if n % 2 == 0 : return True
    else : return False

def is_prime(n):
    for i in range(2, n) :
        if n % i == 0 : return True

def is_perfect(n):
    sum = 0
    for i in range(1, n):
        if n % i == 0 : sum = sum + i

    if sum == n : return True
    else : return False
    
def check_Number(n) :
    if is_odd(n) == True:
        print(f'{n}는/은 홀수였습니다.')
    else:
        print(f'{n}는/은 홀수가 아닙니다.')

    if is_even(n) == True:
        print(f'{n}는/은 짝수였습니다.')
    else:
        print(f'{n}는/은 짝수가 아닙니다.')

    if is_prime(n) == True:
        print(f'{n}는/은 소수입니다.')
    else:
        print(f'{n}는/은 소수가 아닙니다.')

    if is_perfect(n) == True:
        print(f'{n}는/은 완전수 입니다.')
    else:
        print(f'{n}는/은 완전수가 아닙니다.')
