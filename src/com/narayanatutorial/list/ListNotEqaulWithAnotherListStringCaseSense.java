package com.narayanatutorial.list;

import java.util.ArrayList;
import java.util.List;

public class ListNotEqaulWithAnotherListStringCaseSense {

	public static void main(String[] args) {
		// Initializing list
		List<String> firstList = new ArrayList<>();
		firstList.add("Narayana");
		
		//Here Tutorial, T is in small
		firstList.add("tutorial");
		System.out.println("firstList:" + firstList);

		// Initializing another list
		List<String> secondList = new ArrayList<>();
		secondList.add("Narayana");
		
		//Here Tutorial, T is in Caps
		secondList.add("Tutorial");
		
		System.out.println("secondList:" + secondList);

		if (firstList.equals(secondList)) {
			System.out.println("both list are Equal");
		}
		else {
			System.out.println("both list are  Not equal");
		}
	}

}
