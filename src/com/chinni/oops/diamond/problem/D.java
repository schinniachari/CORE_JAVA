package com.chinni.oops.diamond.problem;
// DiamondProblem 
interface A{
default void m1(){
System.out.println("in A interface");
}
}
interface B extends A{
default void m1(){
System.out.println("in B interface");
}
}
interface C extends A{
default void m1(){
System.out.println("in C interface");
}
}
/*class D implements B,C{
 
}*/