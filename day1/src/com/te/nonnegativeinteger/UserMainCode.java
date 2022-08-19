package com.te.nonnegativeinteger;

public class UserMainCode {

	static void countSeven(int n) {

		int rem = 0;
		int count = 0;
		int c=0;

		while (n > 0) {
			rem = n % 10;
			
			if (rem%2==1) {
				count++;
			}
			n=n/10;
		}
		
			System.out.println(" Count of 7 occurance:" + count);

	}

}
