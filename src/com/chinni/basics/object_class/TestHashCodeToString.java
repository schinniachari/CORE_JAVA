package com.chinni.basics.object_class;


public class TestHashCodeToString {
int x;
static int i;
	
		TestHashCodeToString(int x){
			this.x=x;	
	     }
	    /* @Override
		public String toString(){
			System.out.println("in toString() "+x);	 
	 		return "from toString value is "+this.x;
	    }*/
		@Override
		public int hashCode(){
			System.out.println("in hashCode()  with x= "+x+" and i value "+i);
			return i++;
		}
}
