package com.src.practice;

import java.util.Scanner;

public class MultiplicationTables {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many tables you want to print starting from 1");
		number =sc.nextInt();
		for(int i =1;i<=number;i++) {
			System.out.println("The "+i+"table is below");
		   for (int j=1;j<=10;j++)
		   {
			   System.out.println(i+"*"+j+"="+i*j);
		   }
		}

	}

}
