package com.te.kaprekarnumber;

public class UserMainCode {
	public static int getKaprekarNum(int num) {
		int sq1=num*num;
		int sq2=num*num;
		int count=0;
		int right=0;
		int left=0;
		int n1=1;
		while(sq1>0) {
			int rem = sq1%10;
			count++;
			sq1=sq1/10;
		}
			for (int i = 1; i <= (count/2); i++) {
			n1= n1*10;
			}
			if(count%2!=0) {
				left = sq2%(n1*10);
				right = sq2/(n1*10);
				if(left!=right) {
					left=sq2 % n1;
					right=sq2/n1;
				}
			}
			else {
				left=sq2%n1;
				right=sq2/n1;
			}
			if(left+right==num)
				return 1;
			else
				return -1;
	}
}


