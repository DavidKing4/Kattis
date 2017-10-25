import math

n = int(input())
r = math.sqrt(n)
p = 2
c = 0

while(n > 1 and p < r + 1):
	if(n % p == 0):
		c += 1
		n = n/p
	else:
		p += 1

if(n != 1):
	c += 1

print(c)