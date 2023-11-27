public class Intro {
    public static void main(String[] args) {

        int x = 10;
        int b = x;
        x = 20;
        System.out.println(b);

        //store 5 roll no
        int[] num = new int[5];
        System.out.println(num);

        //data of 5 students
        int[] no = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        System.out.println(no);
        System.out.println(name);
        System.out.println(marks);


        //
        Students student = new Students();
        // student.name = "tamil";
        // student.no = 9;

        student.changeName("selvan");

        student.greetings();
        System.out.println(student);
        System.out.println(student.no);
        System.out.println(student.name);

        //with 3 parameter
        Students s1;
        s1 = new Students(10, "selvan", 10.0f);

        System.out.println(s1);

        // with student as a parameter
        Students s2 = new Students(s1);

        System.out.println(s2.name);

        // change value of s1.name doesn't affect s2.name;
        s1.name = "tamilselvan";

        System.out.println(s2.name);
        System.out.println(s1.name);

        //default constructor
        Students defaultname = new Students();
        System.out.println(defaultname.name);

        //change in reference variable
        Students one = new Students();
        Students two = one;

        System.out.println(two.name);

        one.name = "ram";
        System.out.println(two.name);

        //final 
        final int a = 10;
        //a = 15; //is not allowed

        final Students s4 = new Students();
        s4.name = "changed in final object"; //is allowed

        // s4 = s1; //is not allowed

        A obj;

        for(int i = 0; i<1000000 ; i++) {
            obj = new A("randam  name");
        }


    }

    
}
//create a class
class Students {
    int no;
    String name;
    float marks;

    Students () {
        // this.name = "tamil";
        // this.no = 9;
        // this.marks = 9.0f;
        this(20, "default name", 9.9f);
    }

    Students (int roll, String name, float marks) {
        no = roll;
        this.name = name;
        this.marks = marks;
    }

    Students (Students name1) {
        this.name = name1.name;
    }

    void changeName(String name) {
        this.name = name;
    }

    void greetings() {
        System.out.println("hello " + name);
        System.out.println("hello " + this.no);

    }

}

class A {
    final int a =2;
    String name;

    public A (String name) {
        System.out.println("object is created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        // super.finalize();
        System.out.println("object is destroyed");  
    }
}