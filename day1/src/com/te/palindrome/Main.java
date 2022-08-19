package com.te.palindrome;

import java.util.Scanner;

public class Main extends UserMainCode{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the palindrome range1:");
		 int n1=scanner.nextInt();
		 System.out.println("Enter the palindrome range 2:");
		 int n2=scanner.nextInt();
		 addPalindromes(n1, n2);
	}

}
