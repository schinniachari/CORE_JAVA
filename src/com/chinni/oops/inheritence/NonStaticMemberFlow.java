package com.chinni.oops.inheritence;
class NonStaticMemberFlow 
{
	int x=10;
	{
		System.out.println("inside NSB")	 ;
	}
		NonStaticMemberFlow(){
		super();
		System.out.println("inside no param cons")	 ;
		}
		 NonStaticMemberFlow(int a){
		 	   System.out.println("inside param cons")	 ;
		}
 
}
