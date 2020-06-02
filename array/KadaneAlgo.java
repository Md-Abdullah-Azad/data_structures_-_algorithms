package com.array;
//Kadane's Algorithm
//Given an array arr of N integers. 
//Find the contiguous sub-array with maximum sum.
public class KadaneAlgo {
	int maxSubarraySum(int arr[], int n) {

		int max = arr[0];
		int max_so_far = 0;

		for (int i = 0; i < n; i++) {
			max_so_far = Math.max(arr[i], max_so_far + arr[i]);
			if (max_so_far > max) {
				max = max_so_far;
			}
		}
		return max;
	}
}
