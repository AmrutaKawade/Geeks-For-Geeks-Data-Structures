package Sorting;

import java.util.Scanner;

public class SelectionSort {
	public static void selectionSort(int[] arr){
		for(int i=0;i < arr.length;i++){
			int min = i;
			int j = i+1;
			for(j=i+1;j < arr.length;j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[j] = temp;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] numbers = in.nextLine().split(" ");

		int[] arr = new int[numbers.length];
        for(int i=0;i < numbers.length;i++){
        	arr[i] = Integer.parseInt(numbers[i]);
        }
        selectionSort(arr);
        
        for(int i:arr){
        	System.out.println(i);
        }
	}
}
