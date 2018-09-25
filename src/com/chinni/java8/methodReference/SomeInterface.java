package com.chinni.java8.methodReference;

public interface SomeInterface {
	default void say(){
		System.out.println("in say()");
	}
	void hi(String str);
}
