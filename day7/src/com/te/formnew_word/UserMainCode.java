package com.te.formnew_word;

public class UserMainCode {
	static String formNewWord(String string, int num) {
		int str=string.length();
		String str1=string.substring(0, num);
				String str2=string.substring(string.length()-num);
		System.out.println(str1+str2);
		//String str2=string.substring(num, str);
				
		return string;
	}

}
