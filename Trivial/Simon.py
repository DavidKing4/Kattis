n = int(input())
for i in range(0, n):
	m = input().split(' ')
	if(len(m) >= 2):
		if(m[0] == "simon" and m[1] == "says"):
			for j in m[2:]:
				print(j + ' ', end = "")
			print()
		else:
			print()
	else:
		print()