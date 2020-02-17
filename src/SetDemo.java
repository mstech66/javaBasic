/**
 * Sets
 * Sets are unlike maps they just have list of distinct values.
 * Sets don't have duplicate values in the list.
 * Sets have three different operations: 1) Union 2) Intersection and 3) Difference
 * Set is an interface and we use mainly 2 different types of set: 1) HashSet 2) TreeSet or LinkedHashSet
 * HashSet internally uses HashMap and doesn't contain duplicate values but it can include null values. Use this when order of elements is not required O(1) complexity for add, remove and contains, etc.
 * TreeSet stores the values in a sorted manner. It is relatively slower than HashSet O(logn)
 * LinkedHashSet maintains the order of inserted elements. It has O(1) complexity for add, remove and contains
 * The basic operations in set are add, delete, clear, size and contains, etc.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(7,8,1,2,3,4,5,6,5));
        HashSet<Integer> hashSet1 = new HashSet<>(Arrays.asList(1,2,11,2,14,23));
        LinkedHashSet<Integer> hashSet2 = new LinkedHashSet<>(Arrays.asList(12,23,7,90,1));
        hashSet2.forEach(System.out::println);
        //Union of two sets
        Set<Integer> union = new TreeSet<>(hashSet); //by default sorting in TreeSet
        union.addAll(hashSet1); //union operation
        union.forEach(System.out::println);
        //Intersection of two sets
        Set<Integer> intersection = new TreeSet<>(hashSet);
        intersection.retainAll(hashSet1); //intersection op
        intersection.forEach(System.out::println);
        //Difference of two sets
        Set<Integer> diff = new TreeSet<>(hashSet);
        diff.removeAll(hashSet1);
        diff.forEach(System.out::println);
        hashSet.add(20);
    }
}
