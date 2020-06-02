package com.array;

/*
 * Given a sorted array of positive integers, rearrange the array alternately 
 * i.e first element should be the maximum value, second minimum value, 
 * third-second max, fourth-second min and so on.
 * 
 * Examples
 * 
 * Input: arr[] = {1, 2, 3, 4, 5, 6, 7}
 * Output: arr[] = {7, 1, 6, 2, 5, 3, 4}
 * 
 * ------
 * Note: 
 * ------
 * The idea is to use multiplication and modular trick to store two elements at an index.
 * 
 * 
 * max_index : (Moves from right to left)
 * min_index : (Moves from left to right)
 * 
 * For i = 0 to n-1            
    If 'i' is even
       arr[i] += arr[max_index] % max_element * max_element 
       max_index--     
    ELSE // if 'i' is odd
       arr[i] +=  arr[min_index] % max_element * max_element
       min_index++
 */
public class RearrangeArrayAlternately {

	private static void rearrange(int[] arr, int n) {
		int max_index = n-1;
		int min_index = 0;
		int max_elem = arr[n - 1] + 1; 
		for(int i=0; i<n-1; i++) {
			
			if (i % 2 == 0) { 
				arr[i] += arr[max_index] % max_elem * max_elem;
			    max_index-- ; 
			}else{
				 arr[i] +=  arr[min_index] % max_elem * max_elem;
				 min_index++;
			}
		}
		
		for(int i=0; i<n-1; i++) {
			arr[i] = arr[i] / max_elem;
		}
	} 
	
	// Driver code 
    public static void main(String args[]) { 
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; 
        int n = arr.length; 
  
        System.out.println("Original Array"); 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
  
        rearrange(arr, n); 
  
        System.out.print("\nModified Array\n"); 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    }

}
