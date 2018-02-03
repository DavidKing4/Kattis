x = int(input())
n = list(map(int, input().split()))
m = list(n)
m.sort()
c = 0
l = n[0] - 1
for i in range(x):
	if n[i] == m[i] and n[i] > l:
		c += 1
	elif n[i] > l:
		l = n[i]
print(c)