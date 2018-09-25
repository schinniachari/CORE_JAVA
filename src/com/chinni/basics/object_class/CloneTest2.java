package com.chinni.basics.object_class;


public class CloneTest2    {

	int x;
	CloneTest2(int x){
		this.x=x;
	}
		public static void main(String[] args) throws CloneNotSupportedException {
	 		CloneTest ct =new CloneTest();
	 		CloneTest ct1=ct.clone();
			System.out.println(ct==ct1);
		}
	   /* @Override
		public Object clone( ){		 
			return  this;
		}*/
}