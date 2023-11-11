package com.chinni.string_handling;

import java.util.Scanner;

public class SubStringSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter string");
        String s1 = sc.nextLine();
        int len = s1.length();
        String s4 = null;
        char[] ch = new char[len];
        String s = new String(s4);
        System.out.println(s.length());
        for (int i = 0; i < len; i++) {
            ch[i] = s1.charAt(i);
        }//for1
        for (int i = 0; i < len; i++) {
            if (ch[i] == 'c') {
                if (ch[i + 1] == 'h') {
                    if (ch[i + 2] == 'i') {
                        if (ch[i + 3] == 'n') {
                            if (ch[i + 4] == 'n') {
                                if (ch[i + 5] == 'i') {
                                    System.out.println("found chinni " + (i + 5));
                                }
                                //System.out.println("found chinn "+(i+4));
                            }
                            //System.out.println("found chin "+(i+3));
                        }
                        //System.out.println("found chi "+(i+2));
                    }
                    //System.out.println("found ch "+(i+1));
                }
                //System.out.println("found c "+i);
            }
        }//for2
        System.out.println("not found the string 'chinni' ");
    }
}