package com.chinni.oops.polymorphism;

class Person{ 
	String name="chinni";
}
class Student extends Person{
	String branch="java";
}
class Faculty extends Person{
	double sal=100000;
}

class College{
	Person getPerson(){
		return new Person();
	}
}
class ExamHall extends College{
	Student getStudent(){
		return new Student();
	}
	class StaffRoom extends College	{
		Faculty getFaculty(){
			return new Faculty();
		}
	}
}

