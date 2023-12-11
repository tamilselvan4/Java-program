package searching;

public class LinearSearch {
    int val;
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,7};
        int key = 9;
        System.out.println(intSearch(arr, key));

        String str = "hello";
        char c = 'a';
        System.out.println(charSearch(str, c));
    }

    static int intSearch(int[] arr, int key) {
        int len = arr.length;
        for(int i=0; i<len; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static char charSearch(String str, char c) {
        for(int i = 0; i < str.length(); i++) {
            if(c == str.charAt(i)){
                return c;
            }
        }
        return '*';
    }
}
