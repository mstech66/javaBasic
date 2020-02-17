/**
 * Sets
 * Sets are unlike maps they just have list of distinct values.
 * Sets don't have duplicate values in the list.
 * Sets have three different operations: 1) Union 2) Intersection and 3) Difference
 * Set is an interface and we use mainly 2 different types of set: 1) HashSet 2) TreeSet or LinkedHashSet
 * HashSet internally uses HashMap and doesn't contain duplicate values
 * TreeSet stores the values in a sorted manner
 * The basic operations in set are add, delete, clear, size and contains, etc.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(1,2,3,4,5,6,5));
        HashSet<Integer> hashSet1 = new HashSet<>(Arrays.asList(1,2,11,2,14,23));
        Set<Integer> union = new TreeSet<>(hashSet); //by default sorting in TreeSet
        union.addAll(hashSet1); //union operation
//        for (Integer number: union){
//            System.out.println(number);
//        }
        Set<Integer> intersection = new TreeSet<>(hashSet);
        intersection.retainAll(hashSet1); //intersection op
//        for (Integer number: intersection){
//            System.out.println(number);
//        }
        Set<Integer> diff = new TreeSet<>(hashSet);
        diff.removeAll(hashSet1);
        for (Integer number: diff){
            System.out.println(number);
        }
        hashSet.add(20);
    }
}
