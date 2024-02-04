package com.in.array;

import java.util.Arrays;
import java.util.Scanner;


public class SecondMinandSecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnScanner = new Scanner(System.in);
		int n=scnScanner.nextInt();
		int []arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = scnScanner.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println("Second Minimum Present inside array is "+ arr[1]);
		
		System.out.println("Second Maximum Present in array is "+ arr[n-2]);

	}

}
