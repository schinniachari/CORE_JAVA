package com.chinni.basics.non_static_members;
public class  ConsExa
{   int a=10;
     int b=20;
 /* ConsExa(){
		System.out.println("in no arg cons");
	} */
 ConsExa( ){
  		System.out.println(this.a);
		System.out.println(this.b);
 a=50;
 b=60;
	    System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(" in int arg cons ");
	} 
/*  ConsExa(int a,int b){
this.a=a;
this.b=b;
	    System.out.println(a);
		System.out.println(b);
		System.out.println(" in int arg cons ");
	} */
 
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	//	ConsExa e= new ConsExa( );
		ConsExa e= new ConsExa( );
		//ConsExa e= new ConsExa(5,6 );
	}}