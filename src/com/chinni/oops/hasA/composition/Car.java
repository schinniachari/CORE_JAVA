package com.chinni.oops.hasA.composition;

import java.util.Vector;

public class Car {
	private Vector<Tire> tires=new Vector<Tire>(4);
	Car() {
		Tire t1 = new Tire();
		Tire t2 = new Tire();
		tires.add(t1);
		tires.add(t2);
	}
}
