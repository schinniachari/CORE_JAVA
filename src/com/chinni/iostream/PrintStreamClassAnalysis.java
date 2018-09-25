package com.chinni.iostream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamClassAnalysis { 
	public static void main(String[] args) throws IOException {
	 System.out.println("stream is started ");
     PrintStream ps=new PrintStream("message.txt");
     PrintStream ps1=new PrintStream("error.txt");
     System.setOut(ps);
     System.setErr(ps1); 
    // int a=10/0;
     System.out.println(10/0);
    // System.out.println("chinni your doubt is clarified ");
  
	} 
}
