package com.te.sortingandmerg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		Scanner scanner=new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			arrayList.add(scanner.nextInt());
			
		}
		ArrayList<Integer> arrayList2=new ArrayList<Integer>();
		for (int i = 0; i <5; i++) {
			arrayList2.add(scanner.nextInt());
		}
	ArrayList<Integer> ans=UserMainCode.sortMergedArray(arrayList, arrayList2);
	for (Integer integer : ans) {
		System.out.println(integer);
	}

	}
	
	}


