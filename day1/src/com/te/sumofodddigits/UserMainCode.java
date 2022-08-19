package com.te.sumofodddigits;

public class UserMainCode {

	public static int checkSum(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;

			if (rem % 2 == 1)
				sum = sum + rem;

			n = n / 10;

		}
		System.out.println("sum of odd numbers" + sum);
		return sum;

	}
}
