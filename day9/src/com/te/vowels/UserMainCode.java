package com.te.vowels;

public class UserMainCode {
	public static int testVowvels(String str) {

		int count=0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;	
			}
		}
		if(count==5)
		return 1;
		else
			return 2;
	}
}
