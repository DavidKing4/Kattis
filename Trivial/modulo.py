n = [0]*10
c = 10
for i in range(0, 10):
	n[i] = int(input())
	for j in range(0, i):
		if(n[i] % 42 == n[j] % 42 and i != j):
			c -= 1
			break
print(c)