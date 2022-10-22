package com.src.practice;

public class StringDemo {

	public static void main(String[] args) {
		String s1="Adithi";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.isBlank());
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf('t'));
		
		String s2= "Aadhya";
		System.out.println(s1.equals(s2));
		
		String s3= new String("Aadhya");
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s2==s3);
		

	}

}
