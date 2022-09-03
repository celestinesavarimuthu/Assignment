package com.te.vowelsand_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class UserMainCode {
	

	public static ArrayList<String> matchCharacter(String[] strings) {
		ArrayList<String> arrayList=new ArrayList<String>();
		for (int i = 0; i < strings.length; i++) {
			for (int j = 0; j < strings[i].length(); j++) {
				if(strings[i].charAt(0)=='a'||strings[i].charAt(0)=='e'||strings[i].charAt(0)=='i'||
						strings[i].charAt(0)=='o'||strings[i].charAt(0)=='u'&&
						strings[i].charAt(strings[i].length()-1)=='a'||
						strings[i].charAt(strings[i].length()-1)=='e'||
						strings[i].charAt(strings[i].length()-1)=='i'||
						strings[i].charAt(strings[i].length()-1)=='o'||
						strings[i].charAt(strings[i].length()-1)=='u') {
					arrayList.add(strings[i]);
					break;
				}
				
			}
		}
		
		return arrayList;
		
		
		
		
		
	}

	

	

}
