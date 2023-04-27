N = int(input())

list = []

for i in range(N):
    n = input()

    if n.find("insert") >= 0:
        a = n[7:]
        x, y = a.split()
        x = int(x)
        y = int(y)
        list.insert(x, y)

    elif n.find("print") >= 0:
        print(list)

    elif n.find("remove") >= 0:
        c = n[7:]
        c = int(c)
        list.remove(c)

    elif n.find("append") >= 0:
        d = n[7:]
        d = int(d)
        list.append(d)

    elif n.find("sort") >= 0:
        list.sort()

    elif n.find("pop") >= 0:
        list.pop(-1)

    elif n.find("reverse") >= 0:
        list.reverse()
