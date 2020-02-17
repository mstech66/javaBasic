import java.util.Comparator;
import java.util.PriorityQueue;

class CustomComparator implements Comparator<Character>{
    @Override
    public int compare(Character o1, Character o2) {
        Character temp;
        temp = o1;
        o1 = o2;
        o2 = temp;
        return o1.compareTo(o2);
    }
}

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>();

        integerPriorityQueue.add(20);
        integerPriorityQueue.add(10);
        integerPriorityQueue.add(30);
        System.out.println(integerPriorityQueue.poll()); //removes and shows the removed element
        System.out.println(integerPriorityQueue.peek());

        PriorityQueue<Character> characterPriorityQueue = new PriorityQueue<>(new CustomComparator());
        characterPriorityQueue.add('a'); //97
        characterPriorityQueue.add('A'); //65
        System.out.println(characterPriorityQueue.peek());
        for (Character character : characterPriorityQueue) {
            System.out.println(character);
        }
        //toArray Method returns an object array
        Object[] charArray = characterPriorityQueue.toArray();
        for (Object o : charArray) {
            System.out.println("Value: " + o.toString());
        }
    }
}
