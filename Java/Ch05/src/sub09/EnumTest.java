package sub09;

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class EnumTest {
    public static void main(String[] args) {

        Day today = Day.MONDAY;

        switch (today) {
            case MONDAY:
                System.out.println("월요일입니다");
                break;

            case TUESDAY:
                System.out.println("화요일입니다");
                break;

            case WEDNESDAY:
                System.out.println("수요일입니다");
                break;

            case THURSDAY:
                System.out.println("목요일입니다");
                break;

            case FRIDAY:
                System.out.println("금요일입니다");
                break;

            case SATURDAY:
                System.out.println("토요일입니다");
                break;

            case SUNDAY:
                System.out.println("일요일입니다");
                break;
        }
    }
}