package com.te.commonelement;

public class UserMainCode {
	static int sumOfCommonElements(int arr[],int arr1[]) {
		
		int sumOfCom=0;
		int count=0;
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				
				if(arr[i]==arr1[j]) {
					sumOfCom=sumOfCom+arr[i];
					count++;
				}	
			}
			}
		if(count==0)
			return -1;
			else 
				//System.out.println( sumOfCom + " sum of Common elemets") ;
		return sumOfCom;
	}

}
