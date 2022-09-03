package com.te.vowelsand_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//ArrayList<String> list=new ArrayList<String>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of String size:");
		int num = scanner.nextInt();
		String[] strings=new String[num];
		for (int i = 0; i < strings.length; i++) {
			strings[i]=scanner.next();
		} 
		
		ArrayList<String> ans =UserMainCode.matchCharacter(strings);
		for (String string : ans) {
			System.out.println(string);
		}
	}

}
