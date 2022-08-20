package com.te.differencelargeandsmallelement;

import java.util.Scanner;

public class UserMainCode {
	static int getBigDiff(int size) {
		Scanner scanner = new Scanner(System.in);
		int large = 0;
		int c;
		int[] array = new int[size];
		System.out.println("enter the array elements are");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		int small = array[0];
		System.out.println("array elemtens are");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] > large) {
				large = array[i];
			}

		}
		System.out.println("the large element:" + large);
	
		for (int i = 0; i < array.length; i++) {
		
			if(array[i]<small) {
				small=array[i];
			}
		}
		System.out.println("the small element:" + small);
		return c=large-small;
	}

}
