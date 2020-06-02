package com.array;
/*
 * A peak element is an element that is greater than its neighbors.
 * Given an input array nums, where nums[i] != nums[i+1], find a peak element and return its index.
 *  The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 *
 * You may imagine that nums[-1] = nums[n] = -infinity.
 *	
 *	Example 1:
 *	
 *	Input: nums = [1,2,3,1]
 *	Output: 2
 *	Explanation: 3 is a peak element and your function should return the index number 2.
 */
public class PeakElement {
	public static int findPeakElement(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] < nums[mid + 1]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return left;
	}
	
	public static void main(String[] args) {
		int arr[] = { 1, 3, 20, 4, 1, 0 };
        System.out.println("Index of a peak point is " + findPeakElement(arr)); 
	}
}
