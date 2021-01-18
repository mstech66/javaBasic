package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteDemo {
    public static void main(String[] args) {
        List<Integer> idList  = new ArrayList<>();
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

        System.out.println("I added "+ addedOrNot + " fruits");
    }
}
