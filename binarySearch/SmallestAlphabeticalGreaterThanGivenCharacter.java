package com.binarySearch;

public class SmallestAlphabeticalGreaterThanGivenCharacter {

	private static char nextGreatestAlphabet(char[] alphabets, char k) {
		
		int l = 0, r = alphabets.length - 1;
		while (l < r && alphabets[r] > k) {
			 int mid = (l + r) / 2; 
			 if (alphabets[mid] > k) {
				 r = mid;
			 }else {
				 l = mid+1;
			 }
		}
		return alphabets[l]; 
	}
	
	public static void main(String[] args) {
		char letters[] = { 'A', 'K', 'S' };
		char K = 'L';
		char result = nextGreatestAlphabet(letters, K);

		System.out.println(result);
	}
}
