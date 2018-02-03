n = list(map(int, input().split()))
print((n[0] - 1)//(n[1]//n[2]) if ((n[0] - 1)/(n[1]//n[2]))%1 == 0 else ((n[0] - 1)//(n[1]//n[2])) + 1)