package com.in.array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnScanner = new Scanner(System.in);
		int n=scnScanner.nextInt();
		int []arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = scnScanner.nextInt();
		}
		
		int j = 0;
		while(j!=n/2)
		{
			int temp = arr[j];
			arr[j] = arr[n-j-1];
			arr[n-j-1] = temp;
			
			j++;
		}
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
