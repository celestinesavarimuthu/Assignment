package com.te.largestspan;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("enter the" + i + "element:");
			array[i] = scanner.nextInt();
		}
		System.out.println(UserMainCode.getLargestSpan(array));
		
	}

}
