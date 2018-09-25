package com.chinni.oops.diamond.problem;

interface Fly{
default void takeOff(){System.out.println("in Fly: takeOff");}
default void turn(){System.out.println("in Fly: turn");}
default void land(){System.out.println("in Fly: land");}
default void cruise(){System.out.println("in Fly: cruise");}
}
interface FastFly extends Fly{}

class Sample implements FastFly{
}

public class Test {
 
 		public static void main(String[] args){
		System.out.println("in main");
				Sample s=new Sample();
				s.land();		
		}
}