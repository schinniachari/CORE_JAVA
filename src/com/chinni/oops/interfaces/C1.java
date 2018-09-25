package com.chinni.oops.interfaces;
interface i1{
	int x=10;
	Object  m1();}
interface i2{
	int x=20;
	String m1();}
class C1 implements i1,i2{	
	public static void main(String[] args){
// 	System.out.println(x);
// 	System.out.println(C.x);
	}
  //	public Object m1(){}
  public String m1(){
	  return null;}
 }