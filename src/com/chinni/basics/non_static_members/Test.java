package com.chinni.basics.non_static_members;
class Test  
{
	public static void main(String[] args) 
	{
 	Student s1 = new Student(10,"CHINNI","JAVA");
 Student s2 = new Student(11,"ESWAR","RRB");	 
System.out.println(s1.sname);
System.out.println(s2.course);
	System.out.println(s1.course);
  s1.course="oracle";
  s1.sname="mani";
	System.out.println(s1.sname);
	System.out.println(s1.course);
	}
}
