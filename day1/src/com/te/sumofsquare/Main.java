package com.te.sumofsquare;

import java.util.Scanner;

public class Main extends UserMainCode{
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the  sum of square of even values:");
		int n=scanner.nextInt();
		SumOfSquareOfEvenDigits(n);
		
	}

}
