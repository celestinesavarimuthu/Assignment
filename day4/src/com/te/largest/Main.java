package com.te.largest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("element size of the array");
		int size=scanner.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
			
		}
		UserMainCode.checkLargest(arr);
	}

}
