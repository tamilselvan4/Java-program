package enumDemo;

public class EnumTest {
    Day day;

    public EnumTest(Day day) {
        this.day = day;
    }

    public void display() {
        switch (day) {
            case MONDAY:
                System.out.println("Monday is bad");
                break;
            
            case FRIDAY:
                System.out.println("Friday is better");
                break;

            case SUNDAY: case SATURDAY:
                System.out.println("Weekends are best");
                break;
            
            default:
                System.out.println("mid weekdays are so-so");
                break;
        }
    }
}
