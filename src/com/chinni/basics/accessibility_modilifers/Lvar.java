package com.chinni.basics.accessibility_modilifers;
class Lvar {
	int p=0;
	public static void main(String[] args) 
	{ 
		int a=10 , b=20;
	Lvar ab=new Lvar();
	 ab.p =ab.add(a,b);
	   System.out.println(ab.p);
	   m1();
}
int add(int p , int q){System.out.println("in method");
return p+q;
}
static void  m1(){Lvar ab=new Lvar();
int q=ab.p+10;
System.out.println(ab.p);
System.out.println(q);
}
}