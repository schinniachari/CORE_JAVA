package com.chinni.exception_handling.exception_handling;

class TT5 extends TT4{
	void m1() {
		try{
			throw new ClassNotFoundException();
		}
		catch( ClassNotFoundException cnf){
     //throw new InterruptedException(cnf);
		//throw cnf;
		throw new RuntimeException(cnf);
		}
	}
}
