package com.te.removetens;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of an array element");
		int size=scanner.nextInt(); 
		int []arr= new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		
			int arr1[] =(UserMainCode.removeTens(arr));
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
