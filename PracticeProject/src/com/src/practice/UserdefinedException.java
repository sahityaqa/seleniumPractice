package com.src.practice;

import java.util.Scanner;

public class UserdefinedException extends Exception {

	public UserdefinedException(int index) {
		super();
		if(index > 10) {
			System.out.println("String should be 10 characters only");
		}
		else if(index<10) {
			System.out.println("your string should be 10 characters");
		}
	}

	public static void main(String[] args) {
		String str;
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("Enter 10 characters String : ");
			str = sc.next();
          try
          {
        	  if(str.length()!= 10)
			{
				throw new UserdefinedException(str.length());
			}
          }catch(UserdefinedException e) {
        	  e.printStackTrace();
          }
		}
	}

}
