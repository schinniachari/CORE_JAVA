package com.chinni.oops.base_classes;
class Test{
	static void m3(Example e){
		e.m1();
		if (e instanceof Sample)
		{
 		Sample s=(Sample)e;
		s.m2();
		}
	}
	public static void main(String[] args) { 
			 Test.m3(new Sample());
			 Test.m3(new Example()); 
	}
}
