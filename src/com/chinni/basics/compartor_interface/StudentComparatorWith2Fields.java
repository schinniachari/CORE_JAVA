package com.iot.tcp_receiver;
// Java program to demonstrate working of Comparator 

// interface more than one field 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

class StudentComparatorWith2Fields {

	// instance member variables
	String Name;
	int Age;

	// parameterized constructor
	public StudentComparatorWith2Fields(String Name, Integer Age) {
		this.Name = Name;
		this.Age = Age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public Integer getAge() {
		return Age;
	}

	public void setAge(Integer Age) {
		this.Age = Age;
	}

	// overriding toString() method
	@Override
	public String toString() {
		return "Customer{" + "Name=" + Name + ", Age=" + Age + '}';
	}

	static class CustomerSortingComparator implements Comparator<StudentComparatorWith2Fields> {

		@Override
		public int compare(StudentComparatorWith2Fields customer1, StudentComparatorWith2Fields customer2) {

			// for comparison
			int NameCompare = customer1.getName().compareTo(customer2.getName());
			int AgeCompare = customer1.getAge().compareTo(customer2.getAge());

			// 2-level comparison using if-else block
			if (NameCompare == 0) {
				return ((AgeCompare == 0) ? 0 : AgeCompare);
			} else {
				return NameCompare;
			}
		}
	}

	public static void main(String[] args) {

		// create ArrayList to store Student
		List<StudentComparatorWith2Fields> al = new ArrayList<>();

		// create customer objects using constructor initialization
		StudentComparatorWith2Fields obj1 = new StudentComparatorWith2Fields("Ajay", 27);
		StudentComparatorWith2Fields obj2 = new StudentComparatorWith2Fields("Sneha", 23);
		StudentComparatorWith2Fields obj3 = new StudentComparatorWith2Fields("Chinni", 26);
		StudentComparatorWith2Fields obj4 = new StudentComparatorWith2Fields("Ajay", 22);
		StudentComparatorWith2Fields obj5 = new StudentComparatorWith2Fields("Chinni", 26);
		StudentComparatorWith2Fields obj6 = new StudentComparatorWith2Fields("Sneha", 22);

		// add customer objects to ArrayList
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
		al.add(obj6);

		// before Sorting arraylist: iterate using Iterator
		Iterator<StudentComparatorWith2Fields> custIterator = al.iterator();

		System.out.println("Before Sorting:\n");
		while (custIterator.hasNext()) {
			System.out.println(custIterator.next());
		}

		// sorting using Collections.sort(al, comparator);
		Collections.sort(al, new CustomerSortingComparator());

		// after Sorting arraylist: iterate using enhanced for-loop
		System.out.println("\n\nAfter Sorting:\n");
		for (StudentComparatorWith2Fields customer : al) {
			System.out.println(customer);
		}
	}
}
