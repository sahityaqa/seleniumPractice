package com.src.practice;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector<Integer> v= new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		for (int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		Enumeration<Integer> var = v.elements();
		while(var.hasMoreElements()) {
			int temp = var.nextElement();
			//System.out.println(temp);
			if(temp%2==0) {
			System.out.println(temp);
			}
		}

	}

}
