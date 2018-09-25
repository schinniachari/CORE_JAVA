package com.chinni.oops.inheritence;
class NonStaticMemberFlowSub 	  extends NonStaticMemberFlow
{
	int y=20;
	{
		System.out.println("in NSB SUB");
	}
		NonStaticMemberFlowSub(){
		super();
		System.out.println("inside SUB no param cons")	 ;
		}
		 NonStaticMemberFlowSub(int a){
		super(10);
		System.out.println("insideSUB param cons")	 ;
		}
	public static void main(String[] args) 
	{		  	
		NonStaticMemberFlowSub n=new NonStaticMemberFlowSub();	   
	
		System.out.println("Hello World!");
	}
}
