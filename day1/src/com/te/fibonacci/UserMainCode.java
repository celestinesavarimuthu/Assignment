package com.te.fibonacci;

public class UserMainCode {
	
	static int getSumOfNfibos(int input) {
		int a=0,b=1;
		int d,sum=1;
		if(input==0) {
			//System.out.println( a+ " ");
			return 0;
		}
	else if(input==1)
		{
			return 1; 
		}
		else
		{
		
			for(int i=1; i<=input-2; i++)
			{
			d=a+b;
			a=b;
			b=d;
			sum = sum+b;
			
			}	
		}
		return sum;
	}}

