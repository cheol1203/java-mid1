package enumeration.ref;

public class EnumRefMain {
    /*
    앞선 코드의 리펙토링
     */
    public static void main(String[] args) {
        int price = 10000;
        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            System.out.println(grade + " 등급의 할인 금액: " + grade.discount(price));
        }
    }
}
