package com.chinni.basics.non_static_members;

class NSMembersExe extends NSMembersExeTest {
	NSMembersExe() {
		System.out.println("in main cons");
	}

	int y = m2();

	int m2() {
		System.out.println("in m2()");
		return 20;
	}

	{
		System.out.println("in NSBlock");
	}

	public static void main(String[] args) {
		System.out.println("in main1");
		System.out.println("Hello World!");
		NSMembersExe n = new NSMembersExe();
		System.out.println("in main" + n.x);
		System.out.println("in main" + n.y);

	}

}
