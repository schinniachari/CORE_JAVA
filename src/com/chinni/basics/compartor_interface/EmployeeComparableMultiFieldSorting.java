
package com.iot.tcp_receiver;

import java.util.Arrays;

public class EmployeeComparableMultiFieldSorting implements Comparable<EmployeeComparableMultiFieldSorting> {
	public static void main(String[] args) {
		// sorting object array
		EmployeeComparableMultiFieldSorting[] empArr = new EmployeeComparableMultiFieldSorting[4];
		empArr[0] = new EmployeeComparableMultiFieldSorting(1, "Mikey", 25, 10000);
		empArr[1] = new EmployeeComparableMultiFieldSorting(20, "Arun", 29, 20000);
		empArr[2] = new EmployeeComparableMultiFieldSorting(1, "Lisa", 35, 5000);
		empArr[3] = new EmployeeComparableMultiFieldSorting(1, "Pankaj", 32, 50000);

		// sorting employees array using Comparable interface implementation
		Arrays.sort(empArr);
		System.out.println("Default Sorting of Employees list:\n" + Arrays.toString(empArr));
	}

	private Integer id;
	private String name;
	private int age;
	private long salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getSalary() {
		return salary;
	}

	public EmployeeComparableMultiFieldSorting(int id, String name, int age, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int compareTo(EmployeeComparableMultiFieldSorting emp) {
		int idDifference = (this.id.compareTo(emp.id)), nameDiff = (this.name.compareTo(emp.getName()));
		if (idDifference == 0)
			return nameDiff == 0 ? 0 : nameDiff;
		return idDifference;
	}

	@Override
	public String toString() {
		return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" + this.salary + "]";
	}

}