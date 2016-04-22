def binarySearch(arr,start,end,search):
    mid = int((start+end)/2)
    print('start'+str(start)+'end'+str(end)+'mid'+str(mid)+'search'+str(search))
    if end >= start:
        if arr[mid] == search:
            return mid
        elif arr[mid] > search:
            return binarySearch(arr,start,mid-1,search)
        elif arr[mid] < search:
            return binarySearch(arr, mid+1, end, search)
    else:
        return -1
    
arr = [int(i) for i in input().split()]
search = eval(input())
start = 0
end = len(arr)-1
ans = binarySearch(arr,start,end,search)
print(ans)     

        
