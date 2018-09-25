package com.chinni.oops.inheritence;
class TestAB1 {
	public static void main(String[] args)  {
		 B1 b=new B1();
		 A1 a=new B1(); 
	System.out.println(b.x+"..."+b.y);
	System.out.println(a.x+"..."+a.y);
	System.out.println(A1.x+"..."+B1.x);
	System.out.println("***************"); 
	  b.x=5;
	  a.x=6;	
	System.out.println(b.x+"..."+b.y);
	System.out.println(a.x+"..."+a.y);		
	System.out.println(A1.x+"..."+B1.x);
	 	}
}
