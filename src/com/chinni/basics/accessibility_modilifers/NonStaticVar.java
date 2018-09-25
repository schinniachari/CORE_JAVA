package com.chinni.basics.accessibility_modilifers;
class NonStaticVar 
{int x;
int y;
	public static void main(String[] args) 
	{
		m1();
	}
static void m1()
	{NonStaticVar a =new NonStaticVar();
System.out.println(a.x);
    }
static void m2()
	{NonStaticVar a =new NonStaticVar();
System.out.println(a.x);
    }}