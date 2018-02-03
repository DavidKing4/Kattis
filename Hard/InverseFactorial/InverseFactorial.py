import math

n = int(input())
c = 0
if(n <= 362880):
	while(n > 1):
		c += 1
		n = n//(c + 1)
	c+= 1
	print(c)

c = 10
nl = int(math.log(n, 10)) + 1
l = 7
m = 36288

while(l != nl):
	# print(f"c = {c}")
	# print(f"l = {l}")
	# print(f"m = {m}")
	# print(f"c*m = {c*m}")
	c += 1
	l = l + int(math.log(c, 10))
	if(int(math.log((c) * m, 10)) > int(math.log((c) * 10000, 10))):
		l += int(math.log((c) * m, 10)) - int(math.log((c) * 10000, 10))
	if((math.log(c, 10) % 1) == 0):
		l -= 1
	print(int(math.log((c) * m, 10)))
	print(int(math.log((c) * 10000, 10)))
	m = int(str(c * m)[:5])	
print(c)
# print(nl)