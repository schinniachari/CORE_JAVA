package com.chinni.basics;
public class ImplicitObjects {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
 
Class clsName=Class.forName("TestImplicitObjects");
TestImplicitObjects tio = (TestImplicitObjects) clsName.newInstance();

TestImplicitObjects cls=TestImplicitObjects.class.newInstance();
System.out.println(cls);
System.out.println(tio);
 
String s="chinni";
 }
 public static TestImplicitObjects m1(){return null;} 
 

}
