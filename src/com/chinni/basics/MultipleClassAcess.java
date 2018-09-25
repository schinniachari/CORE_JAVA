package com.chinni.basics;
class MultipleClassAcess {
public static void main(String[   ] args){
System.out.println("in main");
A2.main(new String[1000]);

}}


class A2{ 

public static void main(String[] args){
System.out.println("in class AAAAAAA");
B1.main(new String[1000]);
}}

class B1{ 
public static void main(String[] args){
System.out.println("in class bbbbbbbbbbbb");
MultipleClassAcess.main(new String[90]);
}}
