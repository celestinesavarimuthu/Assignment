package com.te.evensumduplicateelements;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int input = scanner.nextInt();
		int[] arr=new int [input];
		
		System.out.println("Elements are");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		
		System.out.println(UserMainCode.sumElements(arr));
	}

}
