package com.te.differencelargeandsmallelement;

import java.util.Scanner;

public class Main  {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the element");
	int size=scanner.nextInt();
	int c=UserMainCode.getBigDiff(size);
	
	System.out.println(c);
	
}
}
