package com.chinni.oops.base_classes;

class SubCls extends SuperCls {
	public static void main(String[] args) {
		// different accessbility modifier ACCESSING in subclass
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		// static members in static members
		System.out.println(a);
		System.out.println(SubCls.a);
		SubCls s = new SubCls();
		System.out.println(s.a);
		SubCls s1 = null;
		System.out.println(s1.a);

		// non static member in static case
		// System.out.println(b);
		// System.out.println(SubCls.b);
		System.out.println(s.b);
		// System.out.println(s1.b);//RuntimeError
		s.m2();
		s.m3();
	}

	void m2() {
		// static members in NON static members
		System.out.println(a);
		System.out.println(SubCls.a);
		SubCls s = new SubCls();
		System.out.println(s.a);
		SubCls s1 = null;
		System.out.println(s1.a);

		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println("***********************");
	}// m2 close

	void m3() {
		// non static members in NON static members
		System.out.println(b);
		// System.out.println(SubCls.b);
		SubCls s = new SubCls();
		System.out.println(s.b);
		SubCls s1 = null;
		// System.out.println(s1.b); Runtime Error

		System.out.println(this.b);
		System.out.println(super.b);
		System.out.println("*****************");
	}// m3() close

}// class close
