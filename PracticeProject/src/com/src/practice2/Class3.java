package com.src.practice2;

import com.src.practice.Class1;

public class Class3 extends Class1{

	public Class3(int a, int b) {
		super(a, b);
		
	}

	public static void main(String[] args) {
		Class3 c1 = new Class3(300,100);
		c1.Add();
		c1.Sub();

	}

}
