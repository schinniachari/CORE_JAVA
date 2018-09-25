package com.chinni.basics.non_static_members;
class Employee
{
	 int eno;
	 String ename;
	 double sal;
	 String dept;

	 Employee(int a,String b,double c , String d)
		 {
	 eno=a;
	 ename=b;
	 sal=c;
	 dept=d;
	 }

	 void display( ){
 System.out.println(eno);
 System.out.println(ename);
  System.out.println(sal);
   System.out.println(dept);
	 }
}
