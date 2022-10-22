package com.src.practice;

import java.lang.reflect.Constructor;

public class ConstructorExample {
	
	int eno;
	String ename;
	float sal;
	
	public ConstructorExample()
	{
		System.out.println("I am a default constructor");
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}
	public ConstructorExample(int eno,String ename) {
		
		this();
		this.eno=eno;
		this.ename = ename;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}


	public ConstructorExample(int eno) {
		this();
		this.eno = eno;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}


	public ConstructorExample(int eno, String ename, float sal) {
		this(eno, ename);
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}



	

	public static void main(String[] args) {
	/*	ConstructorExample cE1 = new ConstructorExample();
		System.out.println(cE1.eno);
		System.out.println(cE1.ename);
		System.out.println(cE1.sal);
		
		ConstructorExample cE2 = new ConstructorExample(1,"ABC");
		System.out.println(cE2.eno);
		System.out.println(cE2.ename);
		System.out.println(cE2.sal);*/
		
		ConstructorExample cE3 = new ConstructorExample(2,"PQR",12.75f);
		//System.out.println(cE3.eno);
		//System.out.println(cE3.ename);
		//System.out.println(cE3.sal);
		// TODO Auto-generated method stub

	}

}
