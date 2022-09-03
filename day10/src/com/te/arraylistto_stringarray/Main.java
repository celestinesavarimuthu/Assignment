package com.te.arraylistto_stringarray;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size:");
		int num = scanner.nextInt();
		for (int i = 0; i <num; i++) {
			arrayList.add(scanner.next());
			
		}
	String[] strings= UserMainCode.stringToArray(arrayList);
	for (String string : strings) {
		System.out.println(string);
	}
	}

}
