import math

n = int(input()) #nuber of sizes + 1
p = list(map(int, input().split())) #array of page sizes
x = 1 #now many of the previous size are required
i = 0 #what page size we are on
t = 0 #running total of the tape

while i >= 0 and i < n - 1:
	if p[i] > 1:
		if x == 0:
			p[i - 1] += int(p[i]/2)
			t += int(p[i]/2)*math.pow(2, (-(i + 1)/2)-(1/4))
			p[i] -= 2*int(p[i]/2)
			i -= 2

		else:
			if x > p[i]//2:
				x *= 2
				x -= p[i]
				p[i - 1] += int(p[i]/2)
				t += int(p[i]/2)*math.pow(2, (-(i + 1)/2)-(1/4))
				p[i] -= 2*int(p[i]/2)
			else:
				p[i - 1] += x
				p[i] -= 2*x
				t += x*math.pow(2, (-(i + 1)/2)-(1/4))
				x = 0
				i -= 2
	else:
		x *= 2
		x -= p[i]
	i += 1

if i < n - 1:
 	print(t)
else:
 	print("impossible")