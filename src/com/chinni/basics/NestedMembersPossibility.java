package com.chinni.basics;
class NestedMembersPossibility 
{
	public static void main(String[] args) 
	{
	 
		System.out.println("Hello World!");
		m1();
	}
	
	public static void m1(){
		class NestedClassInMethod
		{
			
		};
    }
	static{
		System.out.println("in method level class ");
		}
}