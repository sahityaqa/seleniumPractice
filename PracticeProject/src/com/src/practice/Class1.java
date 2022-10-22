package com.src.practice;

public class Class1 {
	int a, b;

	public Class1(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public void Add() {
		int result = a+b;
		System.out.println("Addition of a and b is :"+ result);
	}
	public void Sub() {
		int result = a-b;
		System.out.println("Subtraction of a and b is :"+ result);
	}
	public static void main(String[] args) {
		Class1 c1= new Class1(100,300);
		c1.Add();
		c1.Sub();
	}
}
