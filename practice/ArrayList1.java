package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("Enter number of elements in arraylist:");
        int n = sc.nextInt();
        int num;
        boolean y;
        for(int i = 0; i < n; i++) {
            num = sc.nextInt();
            y = al.contains(num);
            if(!y) {
                al.add(num);
            }
        }
        Collections.sort(al);
        System.out.println(al);
        sc.close();
    }
}
