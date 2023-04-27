import random
r = random.randint(1,10)
num = int(input("Enter the number: "))

if (num > 10):
    print("Greater than 10")
elif(num < 10):
    print("Less than 10")
else:
    print("Equal")

while(num > 10):
    print("Hello")
    num = num-1

while(True):
    num = int(input("Enter the number: "))
    if(num<r):
        print(f"Wrong Guess {r}")
    elif(num>r):
        print(f"Wrong Guess {r}")
    else:
        print("Correct Guess")
        break