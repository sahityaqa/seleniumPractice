package com.src.practice;

import java.util.Scanner;

public class TwoDimensionalArray1 {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int rowlength,columnlength;
		Scanner sc= new Scanner(System.in);
	/*	a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		
		a[2][0]=70;
		a[2][1]=80;
		a[2][2]=90;*/
		System.out.println("How many rows and columns do you want to insert?");
		rowlength = sc.nextInt();
		columnlength= sc.nextInt();
		for(int i=0;i<rowlength;i++)
		{ 
			System.out.println("Please provide "+columnlength+" elements");
			for(int j=0;j<columnlength;j++)
			{
				a[i][j]= sc.nextInt();
			}
		}
		
		for(int i=0;i<rowlength;i++)
		{
			for(int j=0;j<columnlength;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
