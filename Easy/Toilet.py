n = input()

#toilet seat up
c = 0
p = n[0]
if(p == 'U'):
	if(n[1] == 'D'):
		c += 2
else:
	c += 1
for i in n[2:]: 
	if(i == 'D'):
		c += 2
print(c)

#toilet seat down
c = 0
p = n[0]
if(p == 'D'):
	if(n[1] == 'U'):
		c += 2
else:
	c += 1
for i in n[2:]: 
	if(i == 'U'):
		c += 2
print(c)

#preference
c = 0
p = n[0]
for i in n[1:]:
	if(i != p):
		c += 1
		p = i
print(c)