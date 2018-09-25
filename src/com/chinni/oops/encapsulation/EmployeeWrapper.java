package com.chinni.oops.encapsulation;

import java.util.ArrayList;

public class EmployeeWrapper {
private int age;
private String name;
private ArrayList<Long> mobileNumbers;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public ArrayList<Long> getMobileNumbers() {
	//BREAKS THE ENCAPSULATION RULE
	//	return mobileNumbers;
	//TO MAKE IT POSSIBLE 
	return new ArrayList<Long>(mobileNumbers);
}
public void setMobileNumbers(ArrayList<Long> mobileNumbers) {
	this.mobileNumbers = mobileNumbers;
}
@Override
public String toString() {
	return "EmployeeWrapper [age=" + age + ", name=" + name + ", mobileNumbers=" + mobileNumbers + "]";
}

}
