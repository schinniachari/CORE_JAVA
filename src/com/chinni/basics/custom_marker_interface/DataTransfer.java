package com.chinni.basics.custom_marker_interface;

public class DataTransfer {

	public boolean transfer() {
		if (this instanceof Transfer) {
			System.out.println("Data is Transfered");
			return true;
		}
		return false;
	}
}
