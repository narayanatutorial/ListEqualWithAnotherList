package com.narayanatutorial.list;


import java.util.ArrayList;
import java.util.List;

public class ListNotEqaulWithAnotherList {

	public static void main(String[] args) {
		// Initializing list
		List<Integer> firstList = new ArrayList<>();
		firstList.add(30);
		firstList.add(10);
		firstList.add(50);
		System.out.println("firstList:" + firstList);

		// Initializing another list
		List<Integer> secondList = new ArrayList<>();
		secondList.add(10);
		secondList.add(30);
		secondList.add(50);
		System.out.println("secondList:" + secondList);

		if (firstList.equals(secondList)) {
			System.out.println("both list are Equal");
		}
		else {
			System.out.println("both list are  Not equal");
		}
	}

}
