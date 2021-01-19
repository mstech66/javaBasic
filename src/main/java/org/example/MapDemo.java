package org.example;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Map
 * Map is a key and value pair way of storing information where keys will be distinct throughout the collection
 * Using existing key to add value to map will cost you losing the previous value for the key
 * HashMap is an unsorted map implementation which does not maintain the order of elements
 * LinkedHashMap is similar to HashMap whereas LinkedHashMap will maintain the order of elements
 * TreeMap will have the similar behaviour as well but the elements will be sorted in ascending order
 * HashTable is a thread safe implementation of Map
 * Most HashMaps are not thread safe so apart from HashTable you can also use ConcurrentHashMap or SynchronizedMap for thread safety
 * */
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> dataMap = new HashMap<>();
        dataMap.put(1034, "John");
        dataMap.put(1039, "Carrie");
        dataMap.put(1033, "Pewds");
        dataMap.put(1023, "Cooky");

        for (Map.Entry<Integer, String> data : dataMap.entrySet()) {
            System.out.print("Key: " + data.getKey() + " Value: " + data.getValue());
            System.out.println();
        }

        dataMap.remove(1023);

        for (String data : dataMap.values()) {
            System.out.println("Name: " + data);
        }

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Mango", "C");
        linkedHashMap.put("Apple", "A");
        linkedHashMap.put("Lemon", "C");
        linkedHashMap.put("Banana", "B12");

        System.out.println(linkedHashMap);

        System.out.println("Does it contain Apple? "+ linkedHashMap.containsKey("Apple"));
        linkedHashMap.remove("Apple");
        System.out.println("Does it contain Apple? "+ linkedHashMap.containsKey("Apple"));
        System.out.println(linkedHashMap);

        System.out.print("Fruits with Vitamin C: ");
        for(Map.Entry<String, String> fruit: linkedHashMap.entrySet()){
            if(fruit.getValue().equals("C")){
                System.out.print(fruit.getKey() + " ");
            }
        }
        System.out.println();

        System.out.println(linkedHashMap);

        TreeMap<Integer, String> treeMap  = new TreeMap<>();
        treeMap.putAll(dataMap);

        System.out.println(treeMap);

        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("DSA", 5);
        hashtable.put("Sys Design", 5);
        hashtable.put("JavaScript", 4);
        hashtable.put("OOPS", 3);

        System.out.println(hashtable);
    }
}
