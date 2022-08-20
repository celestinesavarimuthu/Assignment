package com.te.largest;

public class UserMainCode {
	static int checkLargest(int arr[]) {
		int first=arr[0];
		int middle=0;
		int last=arr[0];
		int element=0;
		
		for (int i = 0; i < arr.length; i++) {
			first=arr[0];
		}
		System.out.println(first);
		for (int i = 0; i < arr[i]/2; i++) {
			middle=arr[i];
		}
		System.out.println(middle);

		for (int i = 0; i <=arr.length-1; i++) {
			last=arr[i];
		}
			System.out.println(last);
			
			if(first<middle) {
				System.out.println("largest element:"+middle);
			}
			else if (middle<last) {
				System.out.println("largest elemnt:"+last);
			}
			else if(last<first) {
				System.out.println("largest element:"+first);
			}
			else {
				for (int i = 0; i < arr.length; i++) {
					element=arr[i];
				}
				System.out.println("return same element");
			}
			return element;
		
	}

}
