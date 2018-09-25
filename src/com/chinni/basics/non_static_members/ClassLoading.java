package com.chinni.basics.non_static_members;
class ClassLoading 
{
	public static void main(String[] args) throws ClassNotFoundException{
		//Class.forName("Exa11");
	   String s1="a	\n ";
	   s1=s1.concat("\n");
	   s1=s1.concat("b");

	   System.out.println("value of a is "+s1);

	}
}
