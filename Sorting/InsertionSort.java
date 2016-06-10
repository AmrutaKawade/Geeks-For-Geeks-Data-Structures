package Sorting;

import java.util.Scanner;

public class InsertionSort {
	public static void insertionSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && key < arr[j]){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] numbers = in.nextLine().split(" ");

		int[] arr = new int[numbers.length];
        for(int i=0;i < numbers.length;i++){
        	arr[i] = Integer.parseInt(numbers[i]);
        }
        insertionSort(arr);
        
        for(int i:arr){
        	System.out.println(i);
        }
	}
}
