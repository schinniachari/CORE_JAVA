package com.chinni.oops.hasA.aggregation;

import java.util.Vector;

public class Car {
	private Vector<Tire> tires = new Vector<Tire>(4);

	public void addTire(Tire tt) {
		tires.add(tt);
	}

}