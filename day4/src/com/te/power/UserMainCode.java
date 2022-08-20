package com.te.power;

public class UserMainCode {
	
	static int getSumOfPower(int arr[]) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum= (int) Math.pow(arr[i], i);
		}
		return sum;
		
	}

}
