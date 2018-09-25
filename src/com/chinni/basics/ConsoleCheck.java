package com.chinni.basics;
import java.io.*;

public class ConsoleCheck {
	public static void main(String[] args) {
	 Console cns=System.console();
	 System.out.println(cns);
	 System.out.println("enter username ");
	 System.out.println(cns.readLine());
	 System.out.println("enter password ");
	 System.out.println(cns.readPassword());
	 
	}
}