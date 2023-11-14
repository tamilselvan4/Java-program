package generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student tamil = new Student(90, 55.76f);        
        Student sree = new Student(80, 95.90f);
        Student venkat = new Student(60, 85.90f);
        Student sanju = new Student(70, 90.90f);
        Student prithvi = new Student(50, 75.90f);
        Student sandy = new Student(40, 65.90f);

        Student[] list = {tamil, sree, venkat, sanju, prithvi, sandy};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return -(int) (o1.marks - o2.marks); //for ascending order
                // return (int) (o1.marks - o2.marks);
            }
            
        });

        Arrays.sort(list, (o1,o2) -> -(int) (o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));

        if (tamil.compareTo(sree) < 0) {
            System.out.println("sree has more marks");
        }

    }
}
