package com.te.sumofsquaredigits;

import java.util.Scanner;

public class Main extends UserMainCode{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the digits:");
		int n = scanner.nextInt();
		square(n);
	}

}
