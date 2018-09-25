package com.chinni.basics.non_static_members;
class Exa6{
	static{
System.out.println("SB start");
  Exa6 e=new Exa6();
System.out.println("end of SB");
	}
	
	{
    System.out.println("NSB start");
	System.out.println("end of NSB");
	}
	
	Exa6(){
System.out.println(" cons start");
System.out.println("end of cons block");
	}

	public static void main(String[] args) 
	{
		System.out.println("main start ");
System.out.println("end of main ");
  
	}
}
