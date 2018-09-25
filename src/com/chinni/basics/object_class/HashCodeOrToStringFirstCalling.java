package com.chinni.basics.object_class;


public class HashCodeOrToStringFirstCalling {

	public static void main(String[] args) {
		char[] ch=new char[10];
	 
	System.out.println(" before object creation ");
    TestHashCodeToString ht=new TestHashCodeToString(5);
    TestHashCodeToString ht1=new TestHashCodeToString(5);
    System.out.println(ht);
    System.out.println(ch);
    System.out.println(ht1);
	}
}
