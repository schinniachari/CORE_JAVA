package com.chinni.iostream; 
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
	private int sno;
	private String sname;
	private String course;
	private double fee;

	 transient private double marks = 100;
	transient public String uname = "chinni";
	transient public String pwd = "chinni";
	public transient Address addr = new Address();

	private static final long serialVersionUID = 1L;

	static {
		System.out.println("student class is loaded");
	}

	public Student() {
		System.out.println("Student class is instantiated");
	}

	@SuppressWarnings("unused")
	private void writeObject(ObjectOutputStream oos) throws Exception {
		System.out.println("write object of student class");
		oos.defaultWriteObject();
		oos.writeUTF(uname);
		oos.writeUTF(pwd);
		System.out.println(addr);
		oos.writeUTF(addr.city);
		oos.writeDouble(marks);
		
	}
/*
	public Object readResolve() {
		System.out.println("in readResolution()");
		return marks;
	}*/

	private void readObject(ObjectInputStream ois) throws Exception {
		System.out.println("read object of student class");
		ois.defaultReadObject();
		System.out.println("aftee defaultReadObject()");
		String uname = ois.readUTF();
		System.out.println("uname "+uname);
		String pwd = ois.readUTF();
		System.out.println("pwd "+pwd);
		String addr = ois.readUTF();
		System.out.println("addr "+addr);
		double marks=ois.readDouble();
		System.out.println("marks "+marks);
		System.out.println("last defaultReadObject()");
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

 

	public double getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", course=" + course + ", fee=" + fee + ", uname=" + uname
				+ ", pwd=" + pwd + ", marks=" + marks + ", addr=" + addr + "]";
	}

 
	
}
