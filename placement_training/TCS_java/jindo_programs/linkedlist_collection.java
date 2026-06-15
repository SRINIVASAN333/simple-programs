import java.util.*;
public class linkedlist_collection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        list.addLast(35);
        System.out.println(list);
    }
}
