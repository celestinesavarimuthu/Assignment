package com.te.median;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int arr []=new int [size];
		
		System.out.println("enter the array elements are");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();	
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		System.out.println(UserMainCode.calculateMedian(arr));
		
	}

}
