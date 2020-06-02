package com.array;

/*
 * Given an array of size n, find the majority element. 
 * The majority element is the element that appears more than n/2  times.
 * 
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * 
 * Example 1:
 * Input: [3,2,3]
 * Output: 3
 * 
 * 
 */

class MajorityElement {
    public static boolean isMajority(int a[], int size, int cand) { 
        int i, count = 0; 
        for (i = 0; i < size; i++)  
        { 
            if (a[i] == cand) 
                count++; 
        } 
        if (count > size / 2)  
            return true; 
        else
            return false; 
    }
    public static int findMajorityElement(int[] nums) {
        int maj_index = 0, count = 1, size = nums.length; 
        int i; 
        for (i = 1; i < size; i++){ 
            if (nums[maj_index] == nums[i]) 
                count++; 
            else
                count--; 
            if (count == 0) 
            { 
                maj_index = i; 
                count = 1; 
            } 
        } 
        return nums[maj_index];
    }
    
    public static void main(String[] args) {
    	MajorityElement majorelement = new MajorityElement(); 
//        int a[] = new int[]{1, 3, 3, 1, 2}; 
        int a[] = new int[]{2,2,1,1,1,2,2}; 
        int size = a.length; 
        int cadidate = findMajorityElement(a); 
        if(isMajority(a, size, cadidate)) {
        	System.out.println("Mjority element is " + cadidate);
        }else {
        	System.out.println("No Majority Element"); 
        }
	}
}
