package com.chinni.wrapper_classes;

  public class TestExaSam5 { 
	
  public static void main(String[] args) { 
	  int i=10;
	  i+=10;
	  System.out.println(i);


	 Sample5 s1 = new Sample5();
	 s1.m1(10);
	 s1.m1(new Integer(10));

	 Example5 e=new Example5();
	 e.m1(10);
	 e.m1(new Integer(10)); 
	 e.m1((new Integer(10)).intValue()); 
	} 
}
 