def partition(arr,lo,hi):
    x = arr[hi] #pivot
    i = lo-1 #smaller index
    for j in range(lo,hi):
        if arr[j] <= x:
            i += 1
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
    temp = arr[i+1]
    arr[i+1] = arr[hi]
    arr[hi] = temp
    return (i+1)
            

def quickSort(arr,lo,hi):
    if lo < hi:
        p = partition(arr,lo,hi)
        quickSort(arr,lo,p-1)
        quickSort(arr,p+1,hi)


arr = [int(i) for i in input().split()]
quickSort(arr,0,len(arr)-1)
print(arr)
