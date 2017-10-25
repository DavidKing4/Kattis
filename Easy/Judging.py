n = int(input())
k = [""] * n
b = [""] * n

for i in range(0, n):
	k[i] = input()
for i in range(0, n):
	b[i] = input()

k.sort()
b.sort()

pk = 0
pb = 0
c = 0

while(pk < n and pb < n):
	if(k[pk] == b[pb]):
		c += 1
		pk += 1
		pb += 1

	elif(k[pk] > b[pb]):
		pb += 1

	elif(k[pk] < b[pb]):
		pk += 1

print(c)