import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        //add element

        al.add(3);
        al.add(6);
        al.add(2);
        al.add(9);
        al.add(1);
        al.add(0);
        System.out.println(al.get(0));

        //set element

        al.set(5, 4);
        // for (int i : al) {
        //     System.out.println(i);
        // }
        System.out.println(al);

        //access element

        //using get
        System.out.println(al.get(3));

        //using indexOf
        System.out.println(al.indexOf(9));

        //sublist
        System.out.println(al.subList(0, 3));

        //remove element

        al.remove(2);
        // for (int i : al) {
        //     System.out.println(i);
        // }
        System.out.println(al);

        //size of arrayList

        int size = al.size();
        System.out.println(size);

        //searching

        boolean y = al.contains(9);
        System.out.println(y);

        //loop in arrayList

        for(int j = 0; j < al.size(); j++) {
            System.out.println(al.get(j));
        }

        //sorting

        Collections.sort(al);
        System.out.println(al);

        //delete arraylist

        al.clear();
        System.out.println(al);
        
    }
}
