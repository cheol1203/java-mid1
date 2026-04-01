package time.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class TestPlus {
    /*
    문제 1
    2024년 1월 1일 0시 0분 0초에 1년 2개월 3일 4시간 후의 시각을 찾아라.
     */
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        System.out.println("기준 시각: " + dt);

        Period period = Period.of(1, 2, 3);
        Duration duration = Duration.ofHours(4);
        LocalDateTime plus = dt.plus(period);
        LocalDateTime plus1 = plus.plus(duration);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + plus1);

        //더 좋은 코드
//        LocalDateTime dateTime = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
//        LocalDateTime futureDateTime = dateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
//        System.out.println("기준 시각: " + dateTime);
//        System.out.println("1년 2개월 3일 4시간 후의 시각: " + futureDateTime);
    }
}
