package com.te.arraylistto_stringarray;

import java.util.ArrayList;
import java.util.Collections;

public class UserMainCode {
	public static String[] stringToArray(ArrayList<String> arrayList) {
		Collections.sort(arrayList);
		//System.out.println(arrayList);
		String[] strings=new String[arrayList.size()];
		
		for (int i = 0; i < strings.length; i++) {
			strings[i]=arrayList.get(i);
		}
		return strings ;
		
		
		
		
	}

}
