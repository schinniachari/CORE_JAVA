package com.chinni.basics.non_static_members;
class StackOFERR 
{static int i=0;
	StackOFERR(){
	i++;
	System.out.println("in constructor");
	System.out.println(i);
	StackOFERR e=new StackOFERR();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	StackOFERR e=new StackOFERR();
	}
}
