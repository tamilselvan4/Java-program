import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] num = {5,2,4,2,6,3,9};
        num[2] = 5;

        //sorting

        Arrays.sort(num);
        for(int i:num) {
            System.out.println(i);
        }

        //searching

        int search = Arrays.binarySearch(num, 9);
        System.out.println(search);
        int search1 = Arrays.binarySearch(num, 90);
        System.out.println(search1);

    }
    
}
