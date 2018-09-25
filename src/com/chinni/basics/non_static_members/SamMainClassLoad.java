package com.chinni.basics.non_static_members;
class SamMainClassLoad
{
	static {
		System.out.println("SamMainClassLoad SB");
	}
	public static void main(String[] args) throws ClassNotFoundException {
 	Class.forName("MainClassLoad");
		System.out.println("SamMainClassLoad MAIN");
	//	MainClassLoad  e=new MainClassLoad();
 
			}
}
