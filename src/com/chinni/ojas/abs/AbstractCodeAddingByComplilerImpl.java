package com.chinni.ojas.abs;

public class AbstractCodeAddingByComplilerImpl extends AbstractCodeAddingByCompliler {
	public static void main(String[] args) {
		AbstractCodeAddingByCompliler  acabc = new AbstractCodeAddingByComplilerImpl();
		System.out.println(acabc);
	}

	public AbstractCodeAddingByComplilerImpl() { 
		this(12);
		System.out.println("in AbstractCodeAddingByComplilerImple const");
	}	
	public AbstractCodeAddingByComplilerImpl(int a ) {
		System.out.println("in AbstractCodeAddingByComplilerImple const 1 param "+a);
	}
}
