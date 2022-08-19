package com.te.uniquenumber;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int n = scanner.nextInt();
		int input=getUnique(n);
		if(input==1)
			System.out.println("unique number");
		else
			System.out.println("not unique number");
	}

}
