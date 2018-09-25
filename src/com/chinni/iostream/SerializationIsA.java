package com.chinni.iostream; 
import java.io.Serializable; 
public class SerializationIsA implements Serializable  { 
	int a=20; 
	{
	 System.out.println("super's non static block is executed  ");
	}
	static{
		System.out.println("in super class static block");
	}
	int x;
	public SerializationIsA(int s){
		x=10;
		System.out.println("super class object is created --1 param cons  "+s);
	}
	 public SerializationIsA() {
		 System.out.println(" super o param constructor ");
	}
} 