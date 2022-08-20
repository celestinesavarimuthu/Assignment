package com.te.commonelement;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args)  {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=scanner.nextInt();
		int [] arr=new int [size];
		int [] arr1=new int [size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the element of arr:" +i);	
			arr[i]=scanner.nextInt();
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("enter second the element of arr1:" +i);	
			arr1[i]=scanner.nextInt();
		}
		int result=sumOfCommonElements(arr,arr1);
		System.out.println(result);	
		}
	
	
	


}
