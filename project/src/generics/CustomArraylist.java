package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist {


    private int[] data;
    private static int DEFAULT_VALUE = 10;
    private int size = 0;

    

    public CustomArraylist() {
        this.data = new int[DEFAULT_VALUE];
    }

    public void add(int num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    public int remove() {
        int removedValue = data[--size];
        return removedValue;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }


    private void resize() {
        int[] temp = new int[data.length * 2];

        for(int i=0; i<data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    

    @Override
    public String toString() {
        return "CustomArraylist [data=" + Arrays.toString(data) + ", size=" + size + "]";
    }

    public static void main(String[] args) {
        // ArrayList arraylist = new ArrayList();
        // arraylist.add(45);

        CustomArraylist list = new CustomArraylist();
        list.add(9);
        list.add(10);
        list.add(11);

        for(int i = 0; i < 14; i++) {
            list.add(i * 2);
        }

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add("Hello");

    }
}
