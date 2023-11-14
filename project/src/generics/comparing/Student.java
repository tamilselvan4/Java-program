package generics.comparing;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    // @Override
    // public int compareTo(Student o) {

    //     int diff = (int) (this.marks - o.marks);
    //     // return 0 if both the marks are same
    //     // return negative if o is greater
    //     // positive if this is greater
    //     return diff;
    // }

    @Override
    public String toString() {
        return marks + "";
    }

    
    
}
