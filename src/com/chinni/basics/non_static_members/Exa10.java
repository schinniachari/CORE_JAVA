package com.chinni.basics.non_static_members;
class Exa10{
	      static int x=5;
		static  int y=10;
	 static Exa10 e = m2();
	 static int a=m1();
	 
	 static Exa10 m2(){
		 System.out.println(e);
		 return new Exa10();
	 }
	
	 static int m1(){
		 System.out.println(e);
	 return 10;
	 }
	 /*    { 
    System.out.println(" intializer block"); 
 	System.out.println(e.x );
    System.out.println( e.y);
	     }*/
	 public static void main(String[] args)  { 
	  	System.out.println( e.x );
		 System.out.println( e.y);
		 //e.m1();
	 }}