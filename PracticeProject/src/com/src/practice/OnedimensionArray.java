package com.src.practice;

import java.util.Scanner;

public class OnedimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arraySize;
		int sum =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please provide array size");
		arraySize = scanner.nextInt();
		int a[]= new int[arraySize];
		System.out.println("Please provide the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=scanner.nextInt();
		}
		
		System.out.println("The length of the array is :"+a.length);
		for(int i =0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
			if(i%2 == 0)
			{
			sum = sum+a[i];
			}
		}
		System.out.println("The sum of the array is :"+sum);

	}

}
