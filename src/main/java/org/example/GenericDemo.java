package org.example;
import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

    static Integer[] intArray = {1,2,3,4,5,6,7,8};

    // public static List arrayToList(Object[] array, List<Object> list){
    //     for(Object object: array){
    //         list.add(object);
    //     }
    //     return list;
    // }

    public static <T> List<T> arrayToList(T[] array, List<T> list){
        for(T object: array){
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        // List<String> integers = arrayToList(intArray, new ArrayList<>()); //this is an error but it doesn't show in the compile time
        // List<String> integers = arrayToList(intArray, new ArrayList<>()); this will show you the error in compile-time
        List<Integer> integers = arrayToList(intArray, new ArrayList<>());
        System.out.println(integers.get(2));
        displayStrings("This", "is", "Manthan", "Mevada");
    }

    public static void displayStrings(String... strings){
        StringBuilder sb = new StringBuilder();
        for(String str: strings){
            sb.append(str + " ");
        }
        System.out.println(sb.toString());
    }
}