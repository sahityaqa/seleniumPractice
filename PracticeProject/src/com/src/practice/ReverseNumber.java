package com.src.practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number, reverse=0;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Please provide some number to reverse");
		number = scanner.nextInt();
		while(number!=0) {
			int remainder = number%10;
			reverse= reverse*10+remainder;
			number = number/10;
		}
		System.out.println("The reversed number is: "+ reverse);
	}

}
