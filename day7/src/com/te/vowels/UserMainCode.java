package com.te.vowels;

public class UserMainCode {
	static String removeEven(String str) {
		String str1="";
		for (int i = 0; i < str.length(); i++) {
			char le=str.charAt(i);
			//System.out.println("char"+letter);
			if((i+1)%2==0) {
				if(le!='a'&&le!='e'&&le!='i'&&le!='o'&&le!='u') {
					str1=str1+le;
					//System.out.println("str1"+str1);
				}
			}
			else if((i+1)%2!=0) {
				str1=str1+le;
				//System.out.println("else"+str1);
			}
		}
		
		
		return str1;
	}


}
