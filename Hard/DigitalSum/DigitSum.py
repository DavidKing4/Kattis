import math

x = int(input())

for i in range(x):
	a = list(map(int, input().split()))
	n = "1"
	t = int(math.log10(a[0])) - 1
	for j in range(t):
		n += "1"
	n = int(n)
	if t > 0:
		n *= math.pow(10, t)
		print(n)
	else:
		print(0)
