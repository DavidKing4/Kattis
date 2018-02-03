x = int(input())
n = list(map(int, input().split(" ")))
list.sort(n)
i = 0;
b = 0
while(i + 2 < x):
	if(n[i] == n[i+2] - 2):
		j = 2;
		while(i + j < x):
			if n[i] != n[i+j] - j:
				break
			j += 1
		print("{}-{}".format(n[i], n[i+j-1]), end=" ")
		if i + j >= x - 2:
			b = i + j
		i += j
	else:
		print(n[i], end=" ")
		b = 0
		i += 1

if(b == x - 2 or b == 0):
	print(n[x-2], end=" ")
	print(n[x-1], end=" ")

if(b == x - 1):
	print(n[x-1], end=" ")