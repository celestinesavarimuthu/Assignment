package com.te.multiples3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size:");
		int num = scanner.nextInt();
		for (int i = 0; i <num; i++) {
			arrayList.add(scanner.nextInt());
		}
		System.out.println("multiples:"+UserMainCode.multiplesOfThree(arrayList));
	}

}
