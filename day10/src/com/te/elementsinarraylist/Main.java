package com.te.elementsinarraylist;

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
		ArrayList<Integer> arrayList2=new ArrayList<Integer>();
		System.out.println("Enter the size:");
		int num1 = scanner.nextInt();
		for (int i = 0; i <num1; i++) {
			arrayList2.add(scanner.nextInt());
		}

int [] arr1=UserMainCode.arrayListSubtrator(arrayList,arrayList2);
		for (int i : arr1) {
			System.out.println(i);
		}
	}

}
