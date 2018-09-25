package com.chinni.basics.object_class;

public class CloneTestHASA implements Cloneable {
A a=new A();
	public static void main(String[] args) throws CloneNotSupportedException { 
		CloneTestHASA ct =new CloneTestHASA();
		CloneTestHASA ct1=(CloneTestHASA) ct.clone();
		System.out.println(ct.a  );
		System.out.println(ct1.a);
		System.out.println(ct);
		System.out.println(ct1);
	} 
} 