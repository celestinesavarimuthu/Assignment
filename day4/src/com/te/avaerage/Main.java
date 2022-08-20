package com.te.avaerage;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=scanner.nextInt();
		int[]arr=new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("elements of : " +i);
			arr[i] = scanner.nextInt();
			
		}	
		
		System.out.println(UserMainCode.averageElements(arr));
	}

}
