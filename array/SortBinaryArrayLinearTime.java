package com.array;

import java.util.Arrays;

public class SortBinaryArrayLinearTime {

	private static void sortBinaryArra(int[] A) {
		int pivot = 1;
		int j = 0;
		for(int i=0; i<A.length; i++) {
			if(A[i] < pivot) {
				swap(A, i, j);
				j++;
			}	
		}
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		int A[] = { 0, 0, 1, 1, 0, 1, 0, 1, 1, 0};
		sortBinaryArra(A);
		System.out.println(Arrays.toString(A));
	}
}
