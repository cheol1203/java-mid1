package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    /*
    문제 3
        시작 날짜와 목표 날짜를 입력해서 남은 기간과 디데이를 구해라. 실행 결과를 참고하자.
        남은 기간: x년 x개월 x일 형식으로 출력한다.
        디데이: x일 남은 형식으로 출력한다.
     */
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        //코드 작성
        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);
        Period between = Period.between(startDate, endDate);
        System.out.println("남은 기간: " + between.getYears() + "년 " + between.getMonths() + "개월 " + between.getDays() + "일");

        //오답 : ChronoUnit을 쓰면 해당 단위로 차이를 구할 수 있음
        long between1 = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("디데이: " + between1 + "일 남음");
    }
}
