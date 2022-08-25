package com.te.fetching_middle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String string=scanner.next();
		
		if(string.length()%2!=0)
			System.out.println("Enter even string");
		else
			System.out.println("middle:"+ UserMainCode.getMiddleChar(string));
	
	}

	
} 
