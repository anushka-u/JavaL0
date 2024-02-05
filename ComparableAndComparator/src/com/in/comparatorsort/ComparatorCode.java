package com.in.comparatorsort;

import java.util.Comparator;
import java.util.TreeSet;



public class ComparatorCode {

	public static void main(String[] args) {
		
		TreeSet<Integer> tSet=new TreeSet<Integer>(new MyComparator());
		tSet.add(12);
		tSet.add(1);
		tSet.add(123);
		tSet.add(4);
		
		System.out.println(tSet);
	}
	
	static class MyComparator implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			if(o1>o2)
			{
				return 1;
			}
			else if(o2>o1)
			{
				return -1;
			}
			else {
				return 0;
			}
		}
		
	}

}
