package org.example;
/**
 * Default Methods
 * 
 * An interface has generally a method declaration which has to be defined when a class implements interface.
 * Default methods were introduced to solve this problem so that you don't have to define it in every implementation.
 * Static methods in interface are similar to static methods or classes.
 */

interface DemoInterface{
    public void demoMethod();

    default void show(){
        System.out.println("Default Method is running!");
    }

    static void staticShow(){
        System.out.println("Static Show is running!");
    }
}

interface Interface1{
    default void show(){
        System.out.println("Show in Interface 1!");
    }
}

interface Interface2{
    default void show(){
        System.out.println("Show in Interface 2");
    }
}

//You must override the default method when it has the same method name in two different interfaces and a class implements them.
class InterfaceImp implements Interface1, Interface2{
    @Override
    public void show() {
        Interface2.super.show();
    }
}

public class DefaultMethodDemo implements DemoInterface{
    public static void main(String[] args) {
        DefaultMethodDemo demo = new DefaultMethodDemo();
        demo.demoMethod();
        demo.show();
        DemoInterface.staticShow();
    }

    @Override
    public void demoMethod() {
        System.out.println("Demo Method in DefaultMethodDemo class");
    }
}