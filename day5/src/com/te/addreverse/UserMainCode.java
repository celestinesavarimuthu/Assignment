package com.te.addreverse;

public class UserMainCode {
	static int addReverse(int array[],int num) {
	
			int sum = 0;
			int reverse = 0;
			int rem = 0;
			for (int i = 0; i < array.length; i++) {
			if (array[i]>num) {
				sum = sum + array[i];
			}
			}
			System.out.println(sum);
			    int temp=sum;
				while (temp > 0) {
					rem = temp % 10;
					reverse = (reverse * 10) + rem;
					temp= temp / 10;
				

				
			}
		
	//int reverse=0;
		//System.out.println(reverse);
		return reverse;
	}

}
