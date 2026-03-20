package enumeration.ex1;

public class ClassGradeEx1_1 {
    /*
    타입 안전 열거형 패턴을 직접 구현하여 열거한 상수들만 사용할 수 있게 하였다.

    외부에서 임의로 ClassGrade의 인스턴스를 생성할 수도 있으므로 생성자를 private로 설정해야한다.
     */
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
