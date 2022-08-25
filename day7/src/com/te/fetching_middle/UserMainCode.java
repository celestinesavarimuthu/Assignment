package com.te.fetching_middle;

public class UserMainCode {
	static StringBuffer getMiddleChar(String string) {
		int str1=string.length()/2-1;
		int str2=str1+1;
		
		StringBuffer buffer=new StringBuffer();
		StringBuffer str=buffer.append(string.charAt(str1)).append(string.charAt(str2));
		System.out.println(str.toString());
		
		return str;
		
	}

}
