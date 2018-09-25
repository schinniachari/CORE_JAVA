package com.chinni.basics.static_members;

class Example  {
	   static int a=10;
	public static void main(String[] args) 	{
		int a=20;
	Example e=new Example();
		System.out.println(" a value1	"+a);
				System.out.println(" a value2"+Example.a);
				System.out.println(" a value 3   "+ e );
  }
}