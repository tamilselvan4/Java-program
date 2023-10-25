import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("BB");
        list.add("AA");
        list.add("BB");
        list.addFirst("CC");
        list.add(0, "DD");
        list.addLast("EE");

        System.out.println(list);

        list.remove(0);
        list.remove("CC");
        list.removeFirst();
        list.removeLast();
        list.removeAll(list);

        System.out.println(list);
    }
}