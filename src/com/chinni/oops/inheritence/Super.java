package com.chinni.oops.inheritence;
class Super 
{	   Super(){
	 System.out.println("in super "+this);
}
}

  class Sub
{ Sub(){
	 System.out.println("in sub "+this);
}
}

class TestSS
{
	

	public static void main(String[] args) 
	{			  
		Sub s=new Sub();
		System.out.println(s);	
		System.out.println("Hello World!");
	}

}