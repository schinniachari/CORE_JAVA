package com.chinni.projects.shapes;

import java.util.*;
class Rectangles implements Shapes{
private double length;
private double breadth;

Rectangles(){    
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the length ");
	this.length=scn.nextInt();
	System.out.println("Enter the breadth ");
 	this.breadth=scn.nextInt();;
 }
@Override
public double findArea(){
	return (length*breadth);
}
@Override
public double findPeri(){
	return  (2*(length+breadth));
}
@Override
public void draw(){
	System.out.println("Rectangle is drawn with area: "+findArea()+"  and with perimeter: "+findPeri());
}
}
