package com.chinni.oops.project;

import java.util.*;
class Squares implements Shapes{
private double side;
 
Squares(){    
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the side of a square ");
	this.side=scn.nextInt();
  }
@Override
public double findArea(){
	return (side*side);
}
@Override
public double findPeri(){
	return  (4*(side));
}
@Override
public void draw(){
	System.out.println("Square is drawn with area: "+findArea()+"  and with perimeter: "+findPeri());
}
}
