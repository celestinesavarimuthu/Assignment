package com.te.sumofcubesandsquare;

public class UserMainCode {
	static int addEvenOdd(int array[]) {
		int cube=0;
		int square=0;
		int add=0;
		for (int i = 0; i < array.length; i++) {
		
			if(array[i] %2==1) {
				cube=cube+array[i]* array[i]*array[i];
				
			}
		}
		System.out.println("cube:"+cube);
		for (int j = 0; j < array.length; j++) {
			
			
			if(array[j]%2==0){
				square=square+array[j]*array[j];
				
			}
		}
		System.out.println("square:"+square);
		
		add=cube+square;
		//System.out.println("sum of odd Even:" +add);
		return add;
	}

}
