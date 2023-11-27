package enumDemo;

public class Main {
    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.display();

        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.display();

        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.display();
    }
}
