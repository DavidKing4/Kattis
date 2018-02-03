import math

n = input()
c = 0

if(len(n) < 7):
	n = int(n)
	while(n > 1):
		c += 1
		n = n//(c + 1)
	c+= 1
	print(c)

else:
	nl = len(n)
	l = 0.0

	while(int(math.floor(l)) + 1 != nl):
		c += 1
		l += math.log10(c)

	print(c)