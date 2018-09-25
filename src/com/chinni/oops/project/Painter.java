package com.chinni.oops.project;

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
		Class cls             =	Class.forName(clsName);
		Object obj         =	cls.newInstance();
 
			if (obj instanceof  Shapes){
				Shapes s=(Shapes)obj;
				s.draw();
			}
	}
}
