package com.chinni.basics.finalll;
class Rules{
 	static final int p ;
	static final int q=m1();
	static {
	p=20;
	}
   	 static int m1(){
		 System.out.println(p+"---"+q);
		 return 10;
	 }
 	public static void main(String[] args){
		 System.out.println(p+"---"+q);
		final int a ;
		   a=0;
		 System.out.println("a value "+a);
		System.out.println("Hello World!");
		SMeth(20);
		SMeth(2);
	Rules r=new Rules();
	 r.NSMeth(10);
 	r.NSMeth(130);
 
	}
	static void SMeth(final int a){
			 System.out.println(" in m2  "+a);
	}

 void NSMeth(final  int a){
 	   System.out.println("in NSMeth "+a);
 }
}