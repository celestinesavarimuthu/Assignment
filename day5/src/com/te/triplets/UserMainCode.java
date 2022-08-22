package com.te.triplets;

public class UserMainCode {
	static boolean checkTriplets(int array[]) {
		boolean count=false;
		for (int i = 0; i < array.length-1; i++) {
			if(array[i]==array[i+1]) {
				if(array[i+1]==array[i+2]) {
				count=true;
				
			}
			}
		}
		
		return count;
	}

}
 