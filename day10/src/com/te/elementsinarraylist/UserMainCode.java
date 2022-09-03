package com.te.elementsinarraylist;

import java.util.ArrayList;

public class UserMainCode {
public static int [] arrayListSubtrator(ArrayList<Integer> arrayList,ArrayList<Integer> arrayList2) {
	ArrayList<Integer> arrayList3=new ArrayList<Integer>(arrayList);
	arrayList3.removeAll(arrayList2);
	//System.out.println("3:"+arrayList3);
	ArrayList<Integer> arrayList4=new ArrayList<Integer>(arrayList2);
	arrayList4.removeAll(arrayList);
	arrayList3.addAll(arrayList4);
	
	
	int [] arr=new int[arrayList3.size()];
	for (int i = 0; i <arr.length; i++) {
		arr[i]=arrayList3.get(i);
	}
	
	
	
	
return arr ;	
}
}
