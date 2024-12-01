package com.test;

public class test{
   public static void main(String[] args) {
       Child3 c = new Child3();
       c.method1();
       c.method2();
       Myin.staticMethod();
       Myin2.staticMethod();
   }
}

class Child3 extends Parent3 implements Myin, Myin2{
    public void method1(){
        System.out.println("method1 in Child3");
    }
}

class Parent3{
    public void method2(){
        System.out.println("method2 in Parent3");
    }
}

interface Myin{
    default void method1(){
        System.out.println("method1 in Myin");
    }
    default void method2(){
        System.out.println("method2 in Myin");
    }
    static void staticMethod(){
        System.out.println("staticMethod in Myin");
    }
}

interface Myin2 {
    default void method1(){
        System.out.println("method1 in Myin2");
    }
    static void staticMethod(){
        System.out.println("staticMethod in Myin2");
    }
}

