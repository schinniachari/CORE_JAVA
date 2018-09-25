package com.chinni.oops.encapsulation;

import java.util.ArrayList;

public class EncapsulationTest {
	public static void main(String[] args) {
		EmployeeWrapper eW = new EmployeeWrapper();
		eW.setAge(24);
		eW.setName("chinnni");
		ArrayList<Long> list = new ArrayList<Long>();
		list.add(7893877745l);
		list.add(9668843777l);
		eW.setMobileNumbers(list);
		System.out.println(eW.getAge() == 24);
		System.out.println(eW.getName() == "chinni");
		System.out.println(eW.getMobileNumbers().hashCode());
		System.out.println(list.hashCode());
		System.out.println(eW.getMobileNumbers() == list);

	}
}
