package com.src.practice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("ABC");
		al.add("PQR");
		al.add("STU");
		al.add("ASD");
		System.out.println(al);
		ListIterator<String> li = al.listIterator();
		while(li.hasNext()) {
			String val = li.next();
			if(val.equals("ABC"))
			 li.set("Sahitya");
			else
				li.remove();
		}
		System.out.println(al);
	}

}
