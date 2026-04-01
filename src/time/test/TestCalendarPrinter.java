package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    /*
    문제 6
        실행 결과를 참고해서 달력을 출력해라.
        입력 조건: 년도, 월
        실행시 날짜의 간격에는 신경을 쓰지 않아도 된다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        printCalender(year,month);
    }

    private static void printCalender(int year, int month) {
        LocalDate firstDay = LocalDate.of(year,month,1);
        LocalDate nextMonth = firstDay.plusMonths(1);

        System.out.println("Su Mo Tu We Th Fr Sa");

        //월요일=1(1%7=1), ... 일요일=7(7%7=0)
        int value = firstDay.getDayOfWeek().getValue() % 7;

        // 각 날짜의 1일이 출력되는 위치 결정
        for (int i = 0; i < value; i++) {
            System.out.print("   ");
        }

        //다음 달 1일의 전날까지 출력
        while(firstDay.isBefore(nextMonth)){
            System.out.printf("%2d ", firstDay.getDayOfMonth());
            if(firstDay.getDayOfWeek()== DayOfWeek.SATURDAY){
                System.out.println();
            }
            firstDay = firstDay.plusDays(1);
        }
    }
}
