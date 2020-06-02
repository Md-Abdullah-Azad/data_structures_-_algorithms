package com.binarySearch;

public class Ocurrence_First_Last {

	static int findFirstOccurence(int search, int[] array) {
		int start = 0;
		int end = array.length - 1;
		int result = -1;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (search == array[middle]) {
				result = middle;
				end = middle-1;
			}else if (search < array[middle]) {
				end = middle-1;
			}else {
				start = middle+1;
			}
		}
		return result;
	}
	
	static int findLastOccurence(int search, int[] array) {
		int start = 0;
		int end = array.length - 1;
		int result = -1;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (search == array[middle]) {
				result = middle;
				start = middle+1;
			}else if (search < array[middle]) {
				end = middle-1;
			}else {
				start = middle+1;
			}
		}
		return result;
	}
	
	public static void main (String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int x = 2; 
        System.out.println("First Occurrence = " + findFirstOccurence(x, arr)); 
        System.out.println("Last Occurrence = " +  findLastOccurence(x, arr));
    } 
}
