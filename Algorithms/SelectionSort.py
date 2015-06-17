"""
arr[] = 64 25 12 22 11

// Find the minimum element in arr[0...4] and place it at beginning
11 25 12 22 64

// Find the minimum element in arr[1...4] and 
// place it at beginning of arr[1...4]
11 12 25 22 64

// Find the minimum element in arr[2...4] and 
// place it at beginning of arr[2...4]
11 12 22 25 64

// Find the minimum element in arr[3...4] and 
// place it at beginning of arr[3...4]
11 12 22 25 64 
Time Complexity: O(n^2)
take first element find smallest element in remaing array and swap it
auxillary space: O(1)
"""

arr = [int(i) for i in input().split()]
for i in range(0,len(arr)-1):
    minIndex = i
    for j in range(i+1,len(arr)):
        if arr[j] < arr[minIndex]:
            minIndex = j
    temp = arr[i]
    arr[i] = arr[minIndex]
    arr[minIndex] = temp
    print(arr)
