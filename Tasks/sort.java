package Tasks;
import java.util.*;

public class sort {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the values from 0 to 2");
        int temp;
        int countZero = 0, countOne = 0, countTwo = 0;
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            if(temp == 0) {
                countZero++;
            }
            else if(temp == 1) {
                countOne++;
            }
            else if(temp == 2) {
                countTwo++;
            }
        }
        while(countZero > 0) {
            System.out.println("0");
            countZero--;
        }
        while(countOne > 0) {
            System.out.println("1");
            countOne--;
        }
        while(countTwo > 0) {
            System.out.println("2");
            countTwo--;
        }
        sc.close();
    }
}
