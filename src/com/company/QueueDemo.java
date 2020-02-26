package com.company;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();

        for(int i=0;i<5;i++){
            integerQueue.add(i);
        }
        int removedElement = integerQueue.poll();
        System.out.println("Removed Element is " + removedElement);

        System.out.println( "Peek is " + integerQueue.peek());

        integerQueue.forEach(System.out::println);
    }
}
