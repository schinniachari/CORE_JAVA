package com.chinni.basics.non_static_members;
class RTAsClassType 
{
	public  RTAsClassType m1(){
	return new RTAsClassType();
	}
	public  RTAsClassType m2(){
	return this; 
	}
	public static void main(String[] args) 
	{
		RTAsClassType e=new RTAsClassType();
		System.out.println(e);
		System.out.println(e.m1() );
		 	System.out.println(e.m2() );
		
	}
}
