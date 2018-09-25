package com.chinni.oops.base_classes;
class TestCases{
	public static void main(String[] args) 
	{ 
		A a=new B();
		A a1=new C();
		//D d1=a;
		//D d2=(D)a;
		B b1=(B)a;
		//C c1=(C)a;

	/*	B b2=(B)(C)(A)(B)a;
		//B b3=(C)(B)(D)(C)(B)a1;
		B b3=(C)(B)(Object)(D)(Object)(C)(B)a1;
		*/		 
		Object obj=new B();
		A a4=(A)obj;
		B b4=(B)obj;
		//C c4=(C)obj;	 //RE
		//D d4=(D)obj;	  //RE

		B b5=(B)new C();
		//B b6=(B)new A();//RE
		//B b7=(B)new D();

		String s="chinni";
		System.out.println(s instanceof Object);	
		//System.out.println(s instanceof Integer);	
		
		Object obj1="chinni";
		System.out.println(obj instanceof Object ); 
		System.out.println(obj instanceof String ); 
		System.out.println(obj instanceof Integer ); 

	}
}
