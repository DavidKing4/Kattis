import math

n = math.factorial(10000)
for i in range (10001, 20000):
	n = n*i
	t = open(str(i) + ".txt", "w")
	t.write(str(n))
	t.close()