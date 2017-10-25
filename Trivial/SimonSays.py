n = int(input())
for i in range(0, n):
	m = input().split(' ')
	if(m[0] == "Simon" and m[1] == "says"):
		for j in m[2:]:
			print(j + ' ')