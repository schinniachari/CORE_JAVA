package com.chinni.iostream;

import java.io.Serializable;

public class SerializationIsASub extends SerializationIsA implements Serializable {
int y; 
{
	System.out.println("sub class nonstatic block ");
}
static{
	System.out.println("in sub class static block");
}
		public SerializationIsASub(){
			super(10);
			y=20;
			System.out.println("sub class object is created");
		}
		@Override
			public String toString() { 
				return "x:"+x+"\ny:"+y;
			}
 

}
