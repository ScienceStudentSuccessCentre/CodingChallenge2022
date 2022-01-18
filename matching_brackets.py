'''
Given a string of parentheses (brackets). Return if it is valid.
A valid parentheses is one where brackets open and close in the right order.
Ex:
Given: "(())"
Output: True
Given: "(()"
Output: False
'''

from itertools import permutations

def matching_brackets(str1: str):
    return True

if __name__ == '__main__':
    count = 0
    if matching_brackets("(())") == True:
        count+=1
    if matching_brackets("(()") == False:
        count+=1
    print("Test 1: (())")
    print("Test 2: (()")
    print(f'Passing tests: {count}/2')
