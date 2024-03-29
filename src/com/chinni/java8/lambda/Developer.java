package com.chinni.java8.lambda;

import java.math.BigDecimal;

public class Developer{
	public String name;
	public BigDecimal salary;
	public int age;
	
	public Developer(String name, BigDecimal bigDecimal, int age) {
		this.name = name;
		this.salary = bigDecimal;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Developer [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
}
