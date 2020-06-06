package com.binarySearch;

public class CeilOfElementInSortedArray {

	static int ceilSearch(int search, int[] array) {

		int left = 0, right = array.length - 1;
		int ceil = -1;
		while (left <= right) {

//			int mid = (left + right) / 2;
			int mid = left + (right - left) / 2; 
			if (array[mid] == search) {
				return array[mid];
			}
			if (search <= array[mid]) {
				ceil = array[mid];
				right = mid-1;
			} else {
				left = mid + 1;
			}
		}

		return ceil;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 4, 6, 8, 9 };
		int n = arr.length;
		int x = 5;
		int index = ceilSearch(x, arr);
		if (index == -1)
			System.out.println("Ceil of " + x + " dosen't exist in array ");
		else
			System.out.println("Ceil of " + x + " is " + index);
	}

}
