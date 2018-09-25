package com.chinni.multi_threading.practice;

class MyThreadSameObjectTest {
	public static void main(String[] args) {
		PrintNumbers pn = new PrintNumbers();
		MyThreadSameObject mt1 = new MyThreadSameObject(pn);
		MyThreadSameObject mt2 = new MyThreadSameObject(pn);
		mt1.start();
		mt2.start();
		System.out.println("Hello World!");
	}
}
