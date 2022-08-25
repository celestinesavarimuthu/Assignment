package com.te.formnew_word;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the String");	
	String string=scanner.next();
	System.out.println("Enter the Number");
	int num=scanner.nextInt();
	System.out.println(UserMainCode.formNewWord(string, num));
}
}
