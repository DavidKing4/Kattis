n = int(input())
if n < 26:
	print("impossible")
elif n > 26:
	print("possible")
else:
	B = False
	C = [False]*13
	D = [False]*13
	H = [False]*13
	S = [False]*13
	for i in range(26):
		t = input().split(" ")
		if(t[1] == "C"):
			C[int(t[0]) - 1] = True
		if(t[1] == "D"):
			D[int(t[0]) - 1] = True
		if(t[1] == "H"):
			H[int(t[0]) - 1] = True
		if(t[1] == "S"):
			S[int(t[0]) - 1] = True

	b = False
	for i in range(13):
		if(C[i] == False):
			b = True
		if(C[i] == True and b == True):
			B = True

	b = False
	for i in range(13):
		if(D[i] == False):
			b = True
		if(D[i] == True and b == True):
			B = True

	b = False
	for i in range(13):
		if(H[i] == False):
			b = True
		if(H[i] == True and b == True):
			B = True

	b = False
	for i in range(13):
		if(S[i] == False):
			b = True
		if(S[i] == True and b == True):
			B = True

	print("possible") if B else print("impossible")