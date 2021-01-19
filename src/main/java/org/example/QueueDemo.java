package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/*
* Queue
* Queue is an ordered collection of First In First Out type. You can use it when you want to insert elements to end and remove from start.
* LinkedList also implements Queue Interface so it can be used to implement queue along with List.
* LinkedList as a queue will be a FIFO structure so you will have ability to perform operations on first and last elements
* No index based operations are supported you can use lists for that.
* Queues can be bounded as well so you can set a fix size for your queue using BlockingQueue
* PriorityQueue will let you iterate through elements in a sorted order.
* Most queues are not thread safe but you can use ConcurrentLinkedQueue or BlockingQueue for multi threaded environments.
* */

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

        //thread safe implementation of queue
        ConcurrentLinkedQueue<String> linkedQueue = new ConcurrentLinkedQueue<>();

        linkedQueue.addAll(Arrays.asList("My Hero Academia", "Death Note", "Saikiki", "Detective Conan"));

        System.out.println(linkedQueue);
        linkedQueue.poll();
        System.out.println(linkedQueue);
    }
}
