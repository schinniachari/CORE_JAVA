package com.chinni.iostream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class CollectionClassRemoveDocumentNotation { 
		public static void main(String[] args) 
				                       throws IOException { 
           StringBuffer sb1=new StringBuffer(); 
           Scanner scn=new Scanner(System.in);
           System.out.println("enter source file ");
			FileInputStream fis=new FileInputStream(scn.nextLine());  
			System.out.println("enter destination file");
	        FileOutputStream fos=new FileOutputStream(scn.nextLine());
             System.out.println("started");
             
			int i,p=0;
			while( (i=fis.read())!=(-1) ){
		
				 
			    if(i==47){ 
			    	if((i=fis.read())==42){ 
			    		while (p==0 &&(i=fis.read())!=(-1) ) { 
			    		
							 if(i==42){ 
								 if( (i=fis.read())==47){ 
									 p=10; 
									 i=32;
									 break;
								 } 
							 }
						}p=0;
			    	}
			    }
				
			    sb1.append((char)i);
			    
			}//while 
			 String s1=new String(sb1);
			 int len=s1.length();
			 int i1=0;
			 while(i1<len){
				 fos.write(s1.charAt(i1));
				 i1++;
			 }
 System.out.println("copy is done ");
	}//main
}//class

 
