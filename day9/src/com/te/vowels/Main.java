package com.te.vowels;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scanner.next();
		int result=UserMainCode.testVowvels(str);
		if( result==1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
