package com.te.CheckChar;

import java.io.Serializable;


public class UserMainCode<T> implements Comparable<T> {
	static int checkChar(String string) {
	int str=string.length();
	//System.out.println(str);
		
				if(string.charAt(0)==string.charAt(str-1))
				return 1;
				else
					return-1;
				
				


		//StringBuffer buffer=new StringBuffer();
		//StringBuffer str3=buffer.append(string.charAt(0)).append(string.length(str-1));
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
