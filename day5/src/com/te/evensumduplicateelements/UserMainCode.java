package com.te.evensumduplicateelements;

public class UserMainCode {
	static int sumElements(int arr[]) {
		int sum = 0;
		int arr1 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[i]=0;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			arr1 = arr[i];
			if (arr[i] % 2 == 0) {
				sum = sum + arr[i];
			}
		}
		
		
	
		return sum;
	
	}

}
