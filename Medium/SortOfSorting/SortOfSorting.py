def compare(s1, s2): #if s2 is bigger than s1
	if(s1[0] == s2[0]):
		if(s1[1] < s2[1]):
			return True
		elif(s1[1] >= s2[1]):
			return False
	elif(s1[0] < s2[0]):
		return True
	elif(s1[0] > s2[0]):
		return False
	return False

def mergeSort(names, first, last):
	if(last - first <= 1):
		return names
	mid = int((first + last)/2)
	names = mergeSort(names, first, mid)
	names = mergeSort(names, mid, last)
	i = 0
	j = mid - first
	k = last - mid + 1
	temp = ['']*len(names)

	while(j != 0 or k != 0 and i > 0):
		if(compare(names[i], names[mid + i])): #names[i] < names[mid + i]
			temp[i] = names[i]
			j -= 1
		else:
			temp[i] = names[mid + i]
			k -= 1
		i -= 1

	while(j != 0):
		temp[i] = names[i]
		j -= 1
	while(k != 0):
		temp[i] = names[mid + i]
		k -= 1

	for l in range(first - last + 1):
		names[l] = temp[l]
	return names

while True:
	n = int(input())
	if(n == 0):
		break
	names = ['']*n
	for i in range(n):
		names[i] = input()
	names = mergeSort(names, 0, n)
	print()
	for i in range(n):
		print(names[i])