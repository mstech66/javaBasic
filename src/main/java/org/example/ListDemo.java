package org.example;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/*
* List
* Lists are unlike sets where you can have duplicate elements. It preserves the order of addition and allows access of elements by index
* ArrayList is aka Dynamic Array. As most arrays are static arraylist is dynamic array which lets you add remove and get elements by index
* ArrayList supports generics as well so they provide compile time type safety making sure the elements in arraylist will have same data type
* LinkedList is similar to ArrayList but it uses a doubly linked list to store the elements in it.
* ArrayLists are preferable in most operations instead of LinkedList but LinkedList can be used in situations where you reuse existing iterators
* to insert and remove elements
* Stack allows you to push, pop and peek elements in a Last In First Out Manner (LIFO)
* CopyOnWriteArrayList is the thread safe implementation of List much explained in bottom notes...
* */

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> idList = new ArrayList<>();
        String[] strings = new String[1022];

        idList.add(1234);
        idList.add(1236);
        idList.addAll(Arrays.asList(1235, 1237, 1233));

        System.out.println(idList);

        idList.remove((Integer) 1234);

        System.out.println(idList);

        Collections.sort(idList);

        Collections.sort(idList, Collections.reverseOrder());

        System.out.println(idList);

        for (int id : idList) {
            System.out.println(id);
        }

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Marina");
        linkedList.add("Taylor");
        linkedList.add("Marina");
        linkedList.add("Marina");

        Collections.sort(linkedList);

        String peeked = linkedList.peek();

        System.out.println(linkedList);

        //Stack
        Stack<String> colorStack = new Stack<>();

        colorStack.push("Red");

        colorStack.push("White");

        colorStack.push("Blue");

        colorStack.pop();

        colorStack.removeAllElements();

        System.out.println(colorStack);

        List<Integer> safeList = Collections.synchronizedList(idList);

        idList.add(3); //this will be now thread safe thanks to above statement

        //this makes it safe but for ex if it a thread is performing add then it blocks other threads which want to get iterator for list

        //This is where we can use CopyOnWriteArrayList
        //it uses a mechanism called copy-on-write for every write (add,set,remove etc) it makes a new copy of elements in list
        //which means read operations (iterate, get, etc.) will work on different copy

        //when to use?
        //sequential writes and concurrent reads kind of situations
        //small write operations and large read operations and also list should have less elements

        CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();

        arrayList.add("Kiwi");
        arrayList.add("Apple");

        List<String> myList = new ArrayList<>(Arrays.asList("Banana", "Apple", "Pineapple", "Watermelon"));

        int addedOrNot = arrayList.addAllAbsent(myList);

        System.out.println("I added " + addedOrNot + " fruits");
    }
}
