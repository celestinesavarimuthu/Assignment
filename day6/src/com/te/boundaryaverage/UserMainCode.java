package com.te.boundaryaverage;

public class UserMainCode {
	static double getBoundaryAverage(int array[]) {
		int max=array[0];
		int min=array[0];
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("max:"+max);
		for (int i = 0; i < array.length; i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("min:"+min);
		
		double res= (float)(max+min)/2;
		return res;
	}

}
