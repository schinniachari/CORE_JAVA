package com.chinni.oops.project;

import java.util.*;
class Circles implements Shapes{
private double radius;
 
 Circles(){
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the radius ");
   this.radius=scn.nextInt();
 }
@Override
public double findArea(){
	return (3.14*radius*radius);
}
@Override
public double findPeri(){
	return  (2*3.14*radius);
}
@Override
public void draw(){
	System.out.println("circle is drawn with area: "+findArea()+"  and with perimeter: "+findPeri());
}
}
					
											