package com.te.kaprekarnumber;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an integer value");
		int num = scanner.nextInt();
		int result =getKaprekarNum(num);
		if(result==1) {
			System.out.println("Number is Kaprekar ");
		}
		else {
			System.out.println("Number is not Kaprekar");
		}
	}
	}


