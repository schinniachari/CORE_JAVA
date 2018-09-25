package com.chinni.oops.base_classes;

class OtherCls 
{
	public static void main(String[] args) {
		//from other classes to sub classes	static members
	System.out.println(SubCls.a) ;
	SubCls s=new SubCls();
	System.out.println(s.a); 
	SubCls s1=null;
	System.out.println(s1.a); 
	//from other classes to sub classes non static members
//	System.out.println(SubCls.b) ;
	SubCls s3=new SubCls();
	System.out.println(s.b); 
	SubCls s2=null;
//System.out.println(s1.b);RunTimeError 
	}

/*void m1(){
//from other classes to sub classes non static members
	System.out.println(SubCls.b) ;
	SubCls s3=new SubCls();
	System.out.println(s.b); 
	SubCls s2=null;
	System.out.println(s1.b); 

}	*/


}
							 