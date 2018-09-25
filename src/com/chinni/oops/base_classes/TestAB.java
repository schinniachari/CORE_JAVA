package com.chinni.oops.base_classes;
class TestAB{ 
	public static void main(String[] args){
		   A a =new B();
	       B b =new B();
		   C c =new C();
		   A ac=new C();
		   A a2 =(A)c;
		   B b1=(B)a;		
		   //A aa=(C)a; 

		   System.out.println("after B");
		   A a1=(A)b;
		   System.out.println("after A");
		  // C c1=(C)a; 
		   System.out.println(a instanceof Object);
		   System.out.println(a instanceof  A);
		   System.out.println(a instanceof B);
		   System.out.println();
		   System.out.println(a instanceof C);
		 
		   // System.out.println(a instanceof D);
		  // System.out.println(a instanceof null);

		  Object o=new B();
		  System.out.println(o instanceof Object);
		   System.out.println(o instanceof  A);
		   System.out.println(o instanceof B);
		   System.out.println(o instanceof C);
		    System.out.println(o instanceof D); 
	}
}
