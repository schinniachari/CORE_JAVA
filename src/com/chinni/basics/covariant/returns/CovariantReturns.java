package com.chinni.basics.covariant.returns;
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
	Student getPerson(){
		return new Student();
	}
}
	class StaffRoom extends College	{
		Faculty getPerson(){
			return new Faculty();
		}
	}