package com.chinni.oops.inheritence;
 class ThisSuperSub extends ThisSuper  {
		 int x=20;
		 	void m1(){		 	 
		System.out.println("this m2::"+this.x);
        //System.out.println("super"+super.x);
	    }	 
		 	void m2(){ 
		System.out.println("this m2::"+this.x);
		System.out.println("super m2::"+super.x);
			} 
			public static void main(String[] args) {
       /*     ThisSuperSub b=new ThisSuperSub();
			b.m2();
			b.m1();*/
			ThisSuper ts=new ThisSuperSub();
			ts.m1();
			}
	 }