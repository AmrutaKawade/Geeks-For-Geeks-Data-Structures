"""
MergeSort(arr[], l,  r)
If r > l
     1. Find the middle point to divide the array into two halves:  
             middle m = (l+r)/2
     2. Call mergeSort for first half:   
             Call mergeSort(arr, l, m)
     3. Call mergeSort for second half:
             Call mergeSort(arr, m+1, r)
     4. Merge the two halves sorted in step 2 and 3:
             Call merge(arr, l, m, r)
Time complexity of Merge Sort is  in all 3 cases (worst, average and best) as merge sort always divides the array in two halves and take linear time to merge two halves.
Auxiliary Space: O(n)
"""
def merge(leftArr,rightArr):
    result = []
    i,j = 0,0
    while(i < len(leftArr) and j < len(rightArr)):
        if leftArr[i] < rightArr[j]:
            result.append(leftArr[i])
            i += 1
        else:
            result.append(rightArr[j])
            j += 1
    while(i < len(leftArr)):
          result.append(leftArr[i])
          i += 1
    while(j < len(rightArr)):
          result.append(rightArr[j])
          j += 1
    print(result)
    return result
          
def mergeSort(arr):
    if len(arr) < 2:
        return arr[:]
    else:
        middle = int(len(arr)/2)
        leftArr = mergeSort(arr[:middle])
        rightArr = mergeSort(arr[middle:])
        return merge(leftArr,rightArr)


arr = [int(i) for i in input().split()]
result = mergeSort(arr)
print(result)
