package time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {
    /*
    ChronoField는 날짜와 시간의 특정 부분을 나타낸다.
    ChronoField나 ChronoUnit은 단독으로 사용되기보다 날짜와 시간을 조회하고 조작할 때 주로 사용된다.
     */
    public static void main(String[] args) {
        ChronoField[] values = ChronoField.values();
        for (ChronoField value : values) {
            System.out.println(value + ", range = " + value.range());
        }

        System.out.println("MONTH_OF_YEAR.range() = " + ChronoField.MONTH_OF_YEAR.range());
        System.out.println("DAY_OF_MONTH.range() = " + ChronoField.DAY_OF_MONTH.range());
    }
}
