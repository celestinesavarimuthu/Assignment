package com.te.median;

import java.util.Arrays;

public class UserMainCode {
	static int calculateMedian(int arr[]) {
		Arrays.sort(arr);
		//for (int i = 0; i < arr.length; i++) {
			if(arr.length%2==0) {
				System.out.println("even median"+(arr[arr.length/2]+arr[arr.length/2-1])/2);
			}
			else {
					System.out.println("odd median"+ arr[arr.length/2]);
			}
		//}
		
		return 0;
		
	}

}
