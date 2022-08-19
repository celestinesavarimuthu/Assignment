package com.te.sumofsquaredigits;

public class UserMainCode {

	static void square(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem * rem;
			n = n / 10;

		}
		System.out.println(sum);
     
	}

}
