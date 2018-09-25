package com.chinni.basics.non_static_members;
class Exa8{
static Exa8 e=new Exa8();
	static{
System.out.println("SB start"); 
System.out.println("end of SB");
	}
	
	{
    System.out.println("NSB start");
	System.out.println("end of NSB");
	}
	
	Exa8(){
System.out.println(" cons start");
System.out.println("end of cons block");
	}

	public static void main(String[] args) 
	{
		System.out.println("main start ");
System.out.println("end of main ");
  
	}
}
