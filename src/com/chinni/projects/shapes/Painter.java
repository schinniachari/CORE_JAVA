package com.chinni.projects.shapes;

import java.util.*;
class Painter{
	public static void main(String[] args) 
		                              throws ClassNotFoundException,
		                                            InstantiationException,
		                                             IllegalAccessException
		{
		System.out.println("Enter the shape you want to draw");
		Scanner scn=new Scanner(System.in);
		String clsName = scn.nextLine();
		
		//upto now i got the class name to load and then i need the reference of that class
		Class cls             =	Class.forName(clsName);
		
		//now i got the reference of that class and then i need to create object of that class --to access NSMembers
		Object obj         =	cls.newInstance();
		
		//now i got the object of that class, now 
			if (obj instanceof  Shapes){
				Shapes s=(Shapes)obj;
				s.draw();
			}
	}
}
