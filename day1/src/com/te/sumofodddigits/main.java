package com.te.sumofodddigits;

import java.util.Scanner;


public class main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the values:");
	
		int n = scanner.nextInt();
		System.out.println(checkSum(n));

	

	}

}
