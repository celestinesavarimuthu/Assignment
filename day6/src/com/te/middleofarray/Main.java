package com.te.middleofarray;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scanner.nextInt();
		int array[]=new int[size];
		
		System.out.println("Elemets are");
		for (int i = 0; i < array.length; i++) {
			array[i]=scanner.nextInt();
		}
		System.out.println("result:"+getMiddleElement(array));
	}

}
