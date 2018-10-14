package com.chinni.basics.convertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class ArrayListToStringArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		String[] array=list.toArray(new String[0]);
		System.out.println(Arrays.asList(array));
		
		//IN JAVA-8
		String[] strings = list.stream().toArray(String[]::new);
		System.out.println(Arrays.asList(strings));
	}

}
