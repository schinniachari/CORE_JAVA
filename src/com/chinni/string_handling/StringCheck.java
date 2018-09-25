package com.chinni.string_handling;

class StringCheck {
	static int a = 10;
	int b = 20;

	public static void main(String[] args) {
		String s3 = new String("hi");
		String s1 = new String("chinni aac");
		String s = "chinni";
		// System.out.println("value is ::" +s1+s2);
		System.out.println("value in string class  ::" + s);
		System.out.println("value in string class  ::" + s.hashCode());
		s = s.concat("achari");

		System.out.println("value in string class  ::" + s);
		System.out.println("value in string class  ::" + s.hashCode());
		System.out.println("chinniachari".equals(s));
		System.out.println("chinniachari".hashCode());
	}
}