n = int(input())
I = [""]*n
a = [-1, -1, -1, -1]*n
h = 100
mx = 0
mn = 0
c = 0
for i in range(n):

	t = input().split(" ")
	I[i] = t[0]

	if(t[1] != "?"):
		for j in range(4):
			a[i][j] = int(t[1])
		h = int(t[1])
		mx += int(t[1])
		mn += (c*int(t[1]))
		c = 0
		for j in range(i-c:i-1)
			a[j][0] = int(t[1])

	else:
		a[i][3] = h
		mx += h
		c += 1

for i in range(0:n):
	L = 100 - ()
	H = 100

for i in range(n):
	print("{} {} {}".format(I[0], a[1], a[2]))

