package com.chinni.basics.object_class;


public class EqualsAndHashCodeRelation {
	int x;
static int i;
EqualsAndHashCodeRelation(int x){
	this.x=x;
}
	public static void main(String[] args) {
		System.out.println("before object creation1");
		EqualsAndHashCodeRelation e1=new EqualsAndHashCodeRelation(10);
		System.out.println("after object creation1");
		EqualsAndHashCodeRelation e2=new EqualsAndHashCodeRelation(20);
       System.out.println("after object creation2");
		System.out.println(e1);
		System.out.println(e2);
	}
@Override
 public boolean equals(Object obj){
	return true; 
 }
@Override
public String toString(){
	System.out.println("in toString() "+x);	 
		return "from toString value is "+this.x;
}
@Override 
public int hashCode(){
	System.out.println("im in hashcode method"+i);
	return i++;
}
}
