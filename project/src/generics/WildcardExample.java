package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class WildcardExample<T> {


    private Object[] data;
    private static int DEFAULT_VALUE = 10;
    private int size = 0;

    

    public WildcardExample() {
        this.data = new Object[DEFAULT_VALUE];
    }

    public void add(T value) {
        if(isFull()) {
            resize();
        }
        data[size++] = value;
    }

    public T remove() {
        T removedValue = (T)(data[--size]);
        return removedValue;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }


    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for(int i=0; i<data.length; i++) {
            temp[i] = (int) data[i];
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

        // CustomGenericArraylist list = new CustomGenericArraylist();
        // list.add(9);
        // list.add(10);
        // list.add(11);

        // for(int i = 0; i < 14; i++) {
        //     list.add(i * 2);
        // }
        
        // System.out.println(list);

        WildcardExample<String> list3 = new WildcardExample<>();
        list3.add("hello");

        System.out.println(list3);
    }
}
