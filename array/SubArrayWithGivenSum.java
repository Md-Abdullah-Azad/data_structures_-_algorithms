package com.array;

/*
 *Given an unsorted array A of size N of non-negative integers, 
 *find a continuous sub-array which adds to a given number S.
 *	
 *	Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
 *	Ouptut: Sum found between indexes 2 and 4
 *	Sum of elements between indices
 *	2 and 4 is 20 + 3 + 10 = 33
 *	
 *	Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
 *	Ouptut: Sum found between indexes 1 and 4
 *	Sum of elements between indices
 *	1 and 4 is 4 + 0 + 0 + 3 = 7
 *	
 *	Input: arr[] = {1, 4}, sum = 0
 *	Output: No subarray found
 *	There is no subarray with 0 sum
 *
 */
public class SubArrayWithGivenSum {

	void subArraySum(int arr[], int n, int sum) {
		int start = 0, end = 0;

		int currSum = 0;

		while (start < arr.length && end <= arr.length) {
			if (currSum == sum) {

				System.out.println("starting index : " + start + ", " + "Ending index : " + (int) (end - 1));

				if (end <= arr.length - 1) {
					currSum += arr[end];
				}
				end++;

			}

			else {
				/*
				 * if the currSum becomes more than required, we keep on subtracting the start
				 * element until it is less than or equal to required target sum.
				 */
				if (currSum > sum) {
					currSum -= arr[start];
					start++;
				} else {
					/*
					 * we add the last element to our currSum until our sum becomes greater than or
					 * equal to target sum.
					 */
					if (end <= arr.length - 1) {
						currSum += arr[end];
					}
					end++;
				}
			}
		}
	}

	static boolean isSubArrayExist(int arr[], int n, int sum) {
		int curr_sum = arr[0];
		int s = 0;

		int resultStart =0;
		int resultEnd = 0;

		for (int e = 1; e < n; e++) {
			while (curr_sum > sum && s < e - 1) {
				curr_sum -= arr[s];
				s++;
			}
			if (curr_sum == sum) {
				resultStart = s;
				resultEnd = e;
				System.out.println("starting index : " + resultStart + ", " + "Ending index : " + (int) (resultEnd - 1));
				return true;
			}

			if (e < n) {
				curr_sum += arr[e];
			}
		}
		
		return (curr_sum == sum);
	}

	public static void main(String[] args) {
		SubArrayWithGivenSum arraysum = new SubArrayWithGivenSum();
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int n = arr.length;
		int sum = 23;
		System.out.println(isSubArrayExist(arr, n, sum));
		// arraysum.subArraySum(arr, n, sum);
	}
}
