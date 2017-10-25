import math

takeinbby = list(map(int, input().split(' ')))
m = takeinbby[0]
n = takeinbby[1]
t = takeinbby[2]

if(t == 1):
	if(n > 14):
		print("TLE")
	elif(math.factorial(n) <= m):
		print("AC")
	else:
		print("TLE")
elif(t == 2):
	if(math.pow(2, n) <= m):
		print("AC")
	else:
		print("TLE")
elif(t == 3):
	if(math.pow(n, 4) <= m):
		print("AC")
	else:
		print("TLE")
elif(t == 4):
	if(math.pow(n, 3) <= m):
		print("AC")
	else:
		print("TLE")
elif(t == 5):
	if(math.pow(n, 2) <= m):
		print("AC")
	else:
		print("TLE")
elif(t == 6):
	if(n*(math.log(n, 2)) <= m):
		print("AC")
	else:
		print("TLE")
elif(t == 7):
	if(n <= m):
		print("AC")
	else:
		print("TLE")