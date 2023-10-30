package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(19);
        son.career("Doctor");

        Daughter daughter = new Daughter(21);
        daughter.career("Coder");

        //we can't create object for the abstract class otherwise
        //we need to override it

        Parent parent = new Parent(10) {

            @Override
            void career(String name) {
                throw new UnsupportedOperationException("Unimplemented method 'career'");
            }

            @Override
            void friend(String name, int age) {
                throw new UnsupportedOperationException("Unimplemented method 'friend'");
            }
            
        };

        parent.print();
    }
}
