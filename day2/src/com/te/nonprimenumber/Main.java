package com.te.nonprimenumber;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int n = scanner.nextInt();
		System.out.println(prime(n));
	}

}
  