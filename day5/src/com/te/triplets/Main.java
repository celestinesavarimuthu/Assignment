package com.te.triplets;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int input = scanner.nextInt();
		int array[]=new int[input];
		
		System.out.println("Enetr the Elements of an array");
		for (int i = 0; i < array.length; i++) {
			array[i]=scanner.nextInt();
		}
		
		System.out.println(UserMainCode.checkTriplets(array));
	}

}
