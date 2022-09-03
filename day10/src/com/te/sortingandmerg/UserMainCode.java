package com.te.sortingandmerg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class UserMainCode {
	public static  ArrayList<Integer> sortMergedArray(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		arrayList.addAll(arrayList2);
		Collections.sort(arrayList);
		
		list.add(arrayList.get(2));
		list.add(arrayList.get(6));
		list.add(arrayList.get(8));
		
		System.out.println(list);
		return list;
	}

}
