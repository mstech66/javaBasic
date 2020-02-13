import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> integerDeque = new LinkedList<>(); //Deque implemented with LinkedList

        integerDeque.add(4);
        integerDeque.addFirst(5);
        integerDeque.add(5);
        integerDeque.addFirst(6);
        integerDeque.add(6);
        integerDeque.addFirst(7);
        integerDeque.add(7);
        for (Integer integer : integerDeque) {
            System.out.print(integer + " ");
        }
        System.out.println("\n");
        Iterator<Integer> iterator = integerDeque.descendingIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");
        Deque<Integer> anotherDeque = new ArrayDeque<>(); //Deque implemented with ArrayDeque

        anotherDeque.add(4);
        anotherDeque.add(5);
        anotherDeque.push(6);
        anotherDeque.addFirst(7);
        anotherDeque.pop();
        for (Integer integer : anotherDeque) {
            System.out.print(integer + " ");
        }
    }
}
