package com.company;
/**
 * Anonymous Classes
 * Classes without names as we know it and yeah just single object.
 * How different from normal classes?
 * No constructors
 * No multiple interface impl or class extends
 * No simultaneous impl or extends just one thing at a time either you use a Class or an interface
 * Stuff to know:
 * it can access local variables in the class which it is impl for ex. id (int)
 * also it can access variables from interface or class
 * Limitations:
 * No static blocks
 * Can use constants/variables declared within the braces of it
 * Can use local methods inhttps://github.com/mstech66/javaBasic.gitside the block but can't use it with instance as Student interface doesn't have it
 */
interface Student{
    String school = "VVM";
    void getName();
    void getId();
}

public class AnonymousClass {
    public static void main(String[] args) {
        int id = 560326;
        Student student = new Student() {
            private static final String name = "Manoj"; //should be final to use a static variable
            @Override
            public void getName() {
                System.out.println("Student " + name + " from "+ school);
                leave();
            }

            @Override
            public void getId() {
                System.out.println("ID: " + id);
            }
            public void leave(){
                System.out.println("Left!");
            }
        };
        student.getName();
        student.getId();
        //with class extends
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("Run called!!");
            }
        };
        thread.start();
        //with interface
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run of Runnable called!");
            }
        };
        Thread t = new Thread(runnable);
        t.start();
        //within constructor (used in designing GUIs)
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run of Constructor called!");
            }
        });
        thread1.start();
    }
}
