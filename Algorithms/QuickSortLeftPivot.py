def partition(arr,lo,hi):
    pivot = arr[lo]
    highestIndex = hi+1
    for i in range(hi,lo,-1):
        if arr[i] >= pivot:
            highestIndex -= 1
            temp = arr[i]
            arr[i] = arr[highestIndex]
            arr[highestIndex] = temp
    temp = arr[highestIndex-1]
    arr[highestIndex-1] = arr[lo]
    arr[lo] = temp   
    return (highestIndex-1)

def quickSort(arr,lo,hi):
    if lo < hi:
        pivot = partition(arr,lo,hi)
        quickSort(arr,lo,pivot-1)    
        quickSort(arr,pivot+1,hi)
        print(' '.join(str(arr[i]) for i in range(lo,hi+1)))
        
size = eval(input())
arr = [int(i) for i in input().split()]
quickSort(arr,0,len(arr)-1)

        
        
    
