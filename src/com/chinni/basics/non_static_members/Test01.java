package com.chinni.basics.non_static_members;
class Test01
{
	public static void main(String[] args) 
	{
		Employee e1 =new Employee(1,"chinni",10000,"dev");
		Employee e2=new Employee(2,"eswar",20000,"railways");
		e1.display();
		e2.display();
		e1.eno=10;
		e2.eno=20;
	    e1.display();
		e2.display();
}
}
