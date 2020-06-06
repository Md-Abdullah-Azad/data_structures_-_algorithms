package com.binarySearch;

public class FloorOfElementInSortedArray {

	static int floorSearch(int search, int[] array) {
		
		int left = 0, right = array.length - 1;
		int floor = -1;
		while (left <= right) {

			int mid = (left + right) / 2;
			if (array[mid] == search) {
				return array[mid];
			}
			if ( mid > 0 && array[mid - 1] <= search && search < array[mid])  {
			            return mid - 1; 
			}
			else if (search < array[mid]) {
				right = mid - 1;
			}
			else {
				floor = array[mid];
				left = mid + 1;
			}
		}

		return floor;
	}
	
	public static void main(String[] args) 
    { 
        int arr[] = { 1, 4, 6, 8, 9 }; 
        int n = arr.length; 
        int x = 3; 
        int index = floorSearch( x, arr); 
        if (index == -1) 
            System.out.println("Floor of " + x + " dosen't exist in array "); 
        else
            System.out.println("Floor of " + x + " is " + arr[index]); 
    } 

}
