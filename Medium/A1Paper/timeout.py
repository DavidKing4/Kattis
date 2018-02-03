import math

n = int(input())
p = list(map(int, input().split(" ")))
t = 0
i = 0

while(i >= 0 and i < n - 1):
    if(p[i] >= 2):
        p[i] -= 2
        p[i-1] += 1
        if(p[i]%2 == 0):
            t += (math.pow(2, -3/4)/(math.pow(2, (i/2))))
        else:
            t += (math.pow(2, -5/4)/(math.pow(2, ((i - 1)/2))))
        i -= 2
    i += 1

if(i < n - 1):
    print(t)
else:
    print("impossible")
