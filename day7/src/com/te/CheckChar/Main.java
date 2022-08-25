package com.te.CheckChar;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str=scanner.nextLine();
	int result=UserMainCode.checkChar(str);
		if(result==1)
			System.out.println(" valid");
		else
			System.out.println("invalid");
		
	}

}
