package com.array;

/*
 * Given an array A[] consisting 0s, 1s and 2s. 
 * The task is to write a function that sorts the given array. 
 * The functions should put all 0s first, then all 1s and all 2s in last.
 *
 *	Examples:
 *	
 *	Input: {0, 1, 2, 0, 1, 2}
 *	Output: {0, 0, 1, 1, 2, 2}
 *	
 *	Input:  {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
 *	Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
 * 
 * Note: this method is also called as dutch national flag problem
 */
public class Sort012 {

	static void sort012(int a[], int n) {
		int low = 0;
		int mid = 0;
		int high = n - 1;
		while (mid <= high) {
			switch (a[mid]) {
				case 0: {
					swap(a, low, mid);
					low++;
					mid++;
					break;
				}
				case 1: {
					mid++; 
		            break; 
				}
				case 2: {
					swap(a, mid, high);
					high--;
					break;
				}
			}
		}
	}

	private static void swap(int a[], int index1, int index2) {
		int temp = a[index1]; 
        a[index1] = a[index2]; 
        a[index2] = temp;
	}

	private static void printArray(int[] arr, int arr_size) {
		int i;
		for (i = 0; i < arr_size; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
	
	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		int arr_size = arr.length;
		sort012(arr, arr_size);
		System.out.println("Array after seggregation ");
		printArray(arr, arr_size);
	}

	
}
