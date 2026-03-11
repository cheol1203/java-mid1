package lang.object.test;

public class RectangleMain {
    /*
    문제: toString(), equals() 구현하기

    1. 다음 코드와 실행 결과를 참고해서 Rectangle 클래스를 만들어라.
    2. Rectangle 클래스에 IDE의 기능을 사용해서 toString(), equals() 메서드를 실행 결과에 맞도록 재정의해라.
    3. rect1과 rect2는 너비(width)와 높이(height)를 가진다. 너비와 높이가 모두 같다면 동등성 비교에 성공해야한다.
     */
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(100, 20);
        Rectangle rect2 = new Rectangle(100, 20);
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect1 == rect2);
        System.out.println(rect1.equals(rect2));
    }
}
