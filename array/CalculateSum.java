package com.in.array;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnScanner = new Scanner(System.in);
		int []arr = new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i] = scnScanner.nextInt();
		}
		
		int sum = 0;
		for (int i : arr) {
			sum+=i;
		}
		System.out.println(sum);
		

	}

}
