package com.chinni.basics.finalll;

class FinalNullVarToAccessMeth {
	static int i;
	public static final TestFinalNullVarToAccessMeth out=null;
	public static void main(String[] args){
		System.err.println("null");
 	   // out=(TestFinalNullVarToAccessMeth)new Test();
		System.out.println("Hello World!");
		System.out.println("m1() "+FinalNullVarToAccessMeth.out.m1());
	}
}