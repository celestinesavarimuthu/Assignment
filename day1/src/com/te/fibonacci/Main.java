package com.te.fibonacci;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the Nth value of fibinacci:");
		 int input=scanner.nextInt();
		
		System.out.println("sum " + getSumOfNfibos(input));
	}

}