package org.example;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Sets
 * Sets are unlike maps they just have list of distinct values.
 * Sets don't have duplicate values in the list.
 * Sets have three different operations: 1) Union 2) Intersection and 3) Difference
 * Set is an interface and we use mainly 2 different types of set: 1) HashSet 2) TreeSet or LinkedHashSet
 * HashSet internally uses HashMap and doesn't contain duplicate values but it can include null values. Use this when order of elements is not required O(1) complexity for add, remove and contains, etc.
 * TreeSet stores the values in a sorted manner. It is relatively slower than HashSet O(logn)
 * LinkedHashSet maintains the order of inserted elements. It has O(1) complexity for add, remove and contains
 * CopyOnWriteArraySet is a quite simple thread safe implementation of sets. It makes a new copy of the underlying array everytime you mutate the collection. Writes are slow and iterators are fast.
 * The basic operations in set are add, delete, clear, size and contains, etc.
 */

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(7, 8, 1, 2, 3, 4, 5, 6, 5));
        System.out.println(hashSet);
        HashSet<Integer> hashSet1 = new HashSet<>(Arrays.asList(1, 2, 11, 2, 14, 23));
        LinkedHashSet<Integer> hashSet2 = new LinkedHashSet<>(Arrays.asList(12, 23, 7, 90, 1));
        System.out.println(hashSet2);

        Set<Integer> hashSet3 = Collections.synchronizedSet(hashSet); //synchronized thread-safe set
        //have to write sync block for concurrent operations
        synchronized (hashSet3) {
            hashSet3.forEach(System.out::println);
        }
        //Union of two sets
        Set<Integer> union = new TreeSet<>(hashSet); //by default sorting in TreeSet
        union.addAll(hashSet1); //union operation
        System.out.println(union);
        //Intersection of two sets
        TreeSet<Integer> intersection = new TreeSet<>(hashSet);
        intersection.retainAll(hashSet1); //intersection op
        System.out.println(intersection);
        //Difference of two sets
        Set<Integer> diff = new TreeSet<>(hashSet);
        diff.removeAll(hashSet1);
        diff.forEach(System.out::println);
        hashSet.add(20);

        CopyOnWriteArraySet<Integer> arrSet = new CopyOnWriteArraySet<>();

        arrSet.add(23);
        arrSet.add(25);
        arrSet.add(27);

        Iterator<Integer> iterator = arrSet.iterator();

        arrSet.add(2);
        arrSet.add(3);

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\n*************************************");

        iterator = arrSet.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
