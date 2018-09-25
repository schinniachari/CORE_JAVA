package com.chinni.oops.inheritence;
class  A9
{		static int x=20;
	A9(){
		System.out.println("in cons A9   "+this);
	}
}
class  B9	 extends A9
{		 	static int x=20;
	B9(){
		System.out.println("in cons B9    "+this);
	}
}

	  class TestAB9	  extends B9
	  {
		  public static void main(String[] args){
		  	 B9 b=new B9();
//			 System.out.println(super.x);
			 System.out.println("in main              "+b);		  
		  }
	  }