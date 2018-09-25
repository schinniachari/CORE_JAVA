package com.chinni.basics.non_static_members;
class  ObjMeth
{
	int eid;
	String ename; 

 
public String toString(){
return "eid::"+eid+"\n"+"ename"+ename;
}
	public static void main(String[] args) 
	{
		ObjMeth e1=new ObjMeth();
	 
        e1.eid=10;
		e1.ename="chinni";

		System.out.println(e1);
		 
	}
}
