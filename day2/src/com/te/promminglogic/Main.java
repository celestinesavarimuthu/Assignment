package com.te.promminglogic;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
				System.out.println("Enter a value");
		int a = scanner.nextInt();
		System.out.println("Enter b value");
		int b = scanner.nextInt();
		System.out.println("Enter c value");
		int c = scanner.nextInt();
		
		plogic(a,b,c);
		
	}

}
