package com.chinni.basics.methods_types;

class LessSizeParameter {  
	    static void m1(byte a){
		System.out.println(" in byte");}
		
		static void m1(short a){
		System.out.println(" in short");}
		
		static void m1(int a){
		System.out.println(" in int");}
     
		static void m1(double a){
		System.out.println(" in double");}
		
		 static void m1(long a){
		System.out.println(" in long");}

	public static void main(String[] args) {
	m1(10);
	m1(1234);
		System.out.println(" ");
		 }
}
