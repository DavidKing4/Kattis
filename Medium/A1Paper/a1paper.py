import math

n = int(input())
p = list(map(int, input().split()))
p.insert(0, 0)
t = 0
x = [0, 1]
i = 1

while i > 0 and i < n:
	if p[i] >= 2 :
		if x[1] == 0:
			p[i - 1] += int(p[i]/2)
			t += int(p[i]/2)*(math.pow(2, (-(i)/2)-(1/4)))
			p[i] -= 2*int(p[i]/2)
			i -= 2

		else:
			if x[1]*(1/math.pow(2, x[0])) > p[i]*(1/math.pow(2, i)):
				p[i - 1] += int(p[i]/2)
				t += int(p[i]/2)*(math.pow(2, (-(i)/2)-(1/4)))
				p[i] -= 2*int(p[i]/2)
				x[0] = i
				x[1] = math.pow(2, i)*(x[1]/math.pow(2, x[0]) - p[i]/math.pow(2, i))
			else:
				s = 1/math.pow(2, i - x[0]);
				for j in range(p[i] + 1):
					if x[1] == j*t:
						p[i - 1] += j//2
						t += j*(math.pow(2, ((-i - 2)/2)-(1/4)))
						p[i] -= j
						x[1] = 0
						i -= 2
						break		
	i += 1

if i < n - 1:
 	print(t)
else:
 	print("impossible")