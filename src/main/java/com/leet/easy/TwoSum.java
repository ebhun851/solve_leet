package com.leet.easy;

public class TwoSum {

	public static void main(String[] args) {
		getIndices(new int[] {2,7,11,19} , 13);
	}
	
	public static int[] getIndices( int list[], int target) {
		
		for(int i =0 ; i < list.length ; i++) {
			for(int j = i + 1 ; j < list.length ; j++) {
				if(target == list[i] + list [j] ) {
					System.out.println("Matching indices are : [ " + i + "," + j + "]");
					return new int[] {i,j};
				}
			}
		}
		
		throw new IllegalArgumentException("Invalid inputs");
	}
}
