package Searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int[] arr,int start,int end,int search){
		int mid = (int)(start+end)/2;
		if(start <= end){
			if(search == arr[mid]){
				return mid;
			}
			if(search < arr[mid]){
				end = mid-1;
				return binarySearch(arr, start, end, search);
			}if(search > arr[mid]){
				start = mid+1;
				return binarySearch(arr, start, end, search);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in))); 
        String[] numbers = in.nextLine().split(" ");
        int search = in.nextInt();
        int[] arr = new int[numbers.length];
        for(int i=0;i < numbers.length;i++){
        	arr[i] = Integer.parseInt(numbers[i]);
        }
        int start = 0;
        int end = numbers.length-1;
        int index = binarySearch(arr,start,end,search);
        System.out.println("Found at:"+index);
	}
}
