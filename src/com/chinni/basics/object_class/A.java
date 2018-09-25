package com.chinni.basics.object_class;

public class A  {
int a;
int b;
@Override
	protected A clone() throws CloneNotSupportedException {
 
		return (A)super.clone();
	}
}
