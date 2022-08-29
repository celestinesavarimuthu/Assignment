package com.te.lastletter;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=scanner.nextLine().toUpperCase();
	System.out.println(UserMainCode.getLastLetter(str));
}
}
