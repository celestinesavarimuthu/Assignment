package com.te.palindrome;

public class UserMainCode {
	
	static void addPalindromes(int n1, int n2) {
		int sumpalin=0;
		
		for(int i=n1; i<=n2; i++)
		{
			int sum=0;
			int num=i;
			while(num>0) {
				int rem=num%10;
				sum=sum *10 +rem;
				num=num/10;
			}
			if(sum==i) {
				sumpalin=sumpalin+sum;
				
			}
			
		}
		System.out.println("sumof palin" + sumpalin);
		
	}

}
