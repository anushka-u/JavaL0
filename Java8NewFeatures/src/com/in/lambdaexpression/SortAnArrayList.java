package com.in.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;

public class SortAnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(2);
		al.add(8);
		al.add(13);

		Collections.sort(al,(o1,o2)-> (o1 > o2) ? 1 : (o1<o2) ? -1 : 0 );
		System.out.println(al);
	}

}
