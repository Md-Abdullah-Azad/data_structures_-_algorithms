package com.binarySearch;

public class BinarySearch {
	
	int binarySearchRecursive(int arr[], int l, int r, int x) {
		
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x) {
				return mid;
			}
			if (arr[mid] > x) {
				return binarySearchRecursive(arr, l, mid - 1, x);
			}
			return binarySearchRecursive(arr, mid + 1, r, x);
		}
		return -1;
	}
	
	int binarySearchIterative(int search, int[] array) {
		int start = 0;
		int end = array.length - 1;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (search < array[middle]) {
				end = middle - 1;
			}
			if (search > array[middle]) {
				start = middle + 1;
			}
			if (search == array[middle]) {
				return middle;
			}
		}
		return -1;
	}

	// Driver method to test above
	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearchRecursive(arr, 0, n - 1, x);
		if (result == -1) {
			System.out.println("Element not present");
		}
		else {
			System.out.println("Element found at index " + result);
		}
		
		
		int resultFound = ob.binarySearchIterative(x, arr);
		if (resultFound == -1) {
			System.out.println("Element not present");
		}
		else {
			System.out.println("Element found at index " + resultFound);
		}
	}
}
