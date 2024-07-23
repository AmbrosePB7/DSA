# function to check if palindrome or not
def isPalindrom(num):
    # copy our number into a temp variable
    temp = num
    
    rev = 0
    
    while temp > 0:
        rem = temp % 10
        rev = rev * 10 + rem
        temp = temp / 10
        
    print(rev)
    if rev == num:
        return True
        
    return False


print(isPalindrom(2772))