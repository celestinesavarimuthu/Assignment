package com.te.power;

import java.util.Scanner;

public class Main  {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of an array:");
	int size=scanner.nextInt();
	
	int[] arr=new int[size];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=scanner.nextInt();
	}
	
	int result=UserMainCode.getSumOfPower(arr);
	System.out.println(result);

}
}
 