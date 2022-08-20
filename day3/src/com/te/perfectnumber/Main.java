package com.te.perfectnumber;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Perfect Number");
		int n = scanner.nextInt();
		boolean result=UserMainCode.perfect(n);
		if(result)
			System.out.println( "TRUE ");
		else
			System.out.println(" FALSE ");
	}

	
}
