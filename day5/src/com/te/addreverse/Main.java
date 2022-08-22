package com.te.addreverse;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		
		int array[] = new int[size];
		int pick=0;
		
		System.out.println("enter the array element");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		System.out.println("pick an array");
			 pick= scanner.nextInt();
			
 System.out.println("reverse" +UserMainCode.addReverse(array,pick));
	}

}
