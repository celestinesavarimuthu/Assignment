package com.te.multiples3;

import java.util.ArrayList;

public class UserMainCode {
	public static ArrayList<Integer> multiplesOfThree(ArrayList<Integer> arrayList){
		ArrayList<Integer> arrayList2=new ArrayList<Integer>();
		for (int i = 2; i <arrayList.size(); i=i+2) {
			arrayList.remove(i);
			//arrayList2.addAll(arrayList);
			
		}
	
		return arrayList;	
	}

}
