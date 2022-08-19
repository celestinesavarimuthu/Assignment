package com.te.reveringnumber;

public class UserMainCode {
	static void reverseNumber(int n) {
		 int sum=0;

		while (n > 0) {
			int r= n % 10;
			System.out.print(r);
			n = n / 10;

		}

	}

}
