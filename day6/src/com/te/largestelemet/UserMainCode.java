package com.te.largestelemet;

public class UserMainCode {
	static int checkLargest(int arr []) {
		int first=arr[0];
		int middle=arr[0];
		int last=arr[0];
		int element=0;
		int oneElement=0;
		
		for (int i = 0; i < arr.length; i++) {
			first=arr[0];
		}
		System.out.println("first:"+first);
		for (int i = 0; i < arr.length; i++) {
			middle=arr[arr.length/2];
		}
		System.out.println("middle:"+middle);

		for (int i = 0; i <=arr.length-1; i++) {
			last=arr[i];
		}
			System.out.println("last:"+last);
			
			if(first>middle) {
				System.out.println("largest element:"+first);
			}
			else if (middle>last) {
				System.out.println("largest element:"+middle);
			}
			else if(last>first) {
				System.out.println("largest element:"+last);
			}
			else {
				System.out.println("same elemet");
			}
				
			
			return oneElement;
		
	}

}
