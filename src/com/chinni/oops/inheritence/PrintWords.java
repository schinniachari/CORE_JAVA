package com.chinni.oops.inheritence;
class PrintWords 
{
	public static void main(String[] args) 
	{
		System.out.println("words 1 "+Words.name1+"words 2 "+Words.name2+"words 2 "+Words.name2);
	}
}

class Words
{
public static final String name1="chemistry";
public static final String name2="physics";
public static final String name3="biology";
}

/*class Words
{
public static final String name1="chinni";
public static final String name2=null;
public static final String name3="achari";
}*/
