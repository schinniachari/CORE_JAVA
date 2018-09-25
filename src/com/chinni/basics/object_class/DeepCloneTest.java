package com.chinni.basics.object_class;

public class DeepCloneTest implements Cloneable {
int x=10;
int y=20;
A a=new A();
	public static void main(String[] args) throws CloneNotSupportedException { 
		DeepCloneTest dct = new DeepCloneTest();
		DeepCloneTest dct1=(DeepCloneTest) dct.clone();
		System.out.println(dct.a==dct1.a);
	}
	@Override
		protected  DeepCloneTest clone() throws CloneNotSupportedException {
		DeepCloneTest dct=(DeepCloneTest) super.clone();
		dct.a= this.a.clone();
			return dct;
		}

}
