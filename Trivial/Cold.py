n = int(input())
c = 0
m = list(map(int, input().split(' ')))
for x in range(0, n):
	if(m[x] < 0):
		c += 1
print (c)