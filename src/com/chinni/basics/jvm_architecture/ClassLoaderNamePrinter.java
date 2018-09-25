package com.chinni.basics.jvm_architecture;

class ClassLoaderNamePrinter 
{
	public static void main(String[] args) 
	{ 
 	   System.out.println(Example.class.getClassLoader());
		System.out.println(java.lang.String.class.getClassLoader());
 		System.out.println(Sample.class.getClassLoader()); 
	}
}
