package com.chinni.basics.object_class;

public class CloneTest implements Cloneable{
	int x=10;
	int y=20;
	CloneTest(){
	}
	/*CloneTest(int x){
		this.x=x;
	 
	}*/
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneTest x =new CloneTest();
		x.x=5;
		x.y=6;
		CloneTest ct=(CloneTest)x.clone();
		System.out.println(ct.x);
		System.out.println(ct.y); 
		System.out.println(ct); 
	    System.out.println( x.clone() == x);
   		System.out.println(x.clone().getClass() == x.getClass());
		System.out.println(x.clone().equals(x));
		
	}
	 @Override
		 public CloneTest clone( ) throws CloneNotSupportedException{		 
			return  (CloneTest)super.clone();
		} 
}