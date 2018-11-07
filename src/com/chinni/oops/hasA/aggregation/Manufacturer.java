package com.chinni.oops.hasA.aggregation;

public class Manufacturer {
public static void main(String args[]) {
	Car c = new Car();
	Tire t1 = new Tire();
	Tire t2 = new Tire();
	c.addTire(t1);
	c.addTire(t2);
	c = null;
	// at this statement car is destroyed but not t1 and t2
}
}