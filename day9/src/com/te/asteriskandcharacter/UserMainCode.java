package com.te.asteriskandcharacter;

public class UserMainCode {
	public static boolean scanStarNeighbors( String string) {
		String astrisk = "*";
		String  [] arr = string.split("\\*");
		
		boolean boo = false ;
		for (int i = 0; i < arr.length-1; i++) {
			
				if(arr[i].charAt(arr[i].length()-1)==arr[i+1].charAt(0))
					boo = true;	
		
		}
		return boo;

}}
