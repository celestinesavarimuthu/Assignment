package com.te.sumofsquare;

public class UserMainCode {

	static void SumOfSquareOfEvenDigits(int n) {
		int sum = 0;
		//int sum1=0;
		while (n > 0) {
			int rem = n % 10;

			//if (rem % 2 == 0) {
				sum = sum+rem * rem;
				//sum1=sum1+sum;
			//}
			n = n / 10;

		}
		System.out.println(sum);

	}
}
