package com.chinni.java8.lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ForSortingCollectionObject {

	public static void main(String[] args) {
 
	List<Developer> listDevs = getDevelopers();

	System.out.println("Before Sort");
	for (Developer developer1 : listDevs) {
		System.out.println(developer1);
	}

	//sort by age
/*	Collections.sort( listDevs, new Comparator<Developer>() {
		@Override
		public int compare(Developer o1, Developer o2) {
			return o1.getAge() - o2.getAge();
		}
	});*/

	//ONLY BY PASSING THE PARAMETER BY USING LAMBDA EXPRESSION
	Collections.sort(listDevs,(o1,o2)-> {return o1.getAge()-o2.getAge();} );
	System.out.println("After Sort");
	
	//lambda
	listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());

	//lambda, valid, parameter type is optional
	listDevs.sort((o1, o2)->o1.getAge()-o2.getAge());

	//FOR ITERATION PURPOSE
/*	for (Developer developer : listDevs) {
		System.out.println(developer);
	}*/

}

private static List<Developer> getDevelopers() {

	List<Developer> result = new ArrayList<Developer>();

	result.add(new Developer("CHINNI", new BigDecimal("70000"), 33));
	result.add(new Developer("ACHARI", new BigDecimal("80000"), 20));
	result.add(new Developer("ESWAR", new BigDecimal("100000"), 10));
	result.add(new Developer("SAI", new BigDecimal("170000"), 55));

	return result;

}

}
