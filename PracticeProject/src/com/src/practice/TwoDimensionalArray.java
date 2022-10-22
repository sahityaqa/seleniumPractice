package com.src.practice;

public class TwoDimensionalArray {
	 
	public static void main(String[] args) {
		int array[][]= {{10,20,30},{40,50,60},{70,80,90,11,12}};
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}
		for(int[] p:array) 
		{
			for(int q : p) 
			{
				System.out.print(q+"  ");
			}
			System.out.println();
		}
	}

}
