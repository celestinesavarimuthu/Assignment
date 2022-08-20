package com.te.avaerage;

public class UserMainCode {

	static double averageElements(int arr[]) {
		int count = 0;
		int sum = 0;
		int average =0;

		for (int i = 0; i < arr.length; i++) {
			if(i>1) {
			if (i==2||i % 2 == 1) {
				
				sum = sum + arr[i];
				count++;
			}
		}
		}
		average = sum / count;
		return average;
	}

}
