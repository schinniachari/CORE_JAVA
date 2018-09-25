package com.chinni.oops.base_classes;
 class UC_DC_CCE_Iof{
	public static void main(String[] args) 
	{
	 A a=new B(); 							 //--upcasting
	System.out.println(a.x);
	//System.out.println(a.y);

	B b=(B)a;									  //--downcasting
	System.out.println(b.y);

	//C c=(C)a;								 //--ClassCastException
	//System.out.println(c.z);

	  if (a instanceof C)	  {				   //--instanceof
	C c=(C)a;
	System.out.println(c.z);
	  }

	}
}
