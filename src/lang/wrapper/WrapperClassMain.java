package lang.wrapper;

public class WrapperClassMain {
    /*
    valueOf를 통해 기본형을 래퍼 클래스로 변경하는 것을 박싱이라 한다.
    intValue같은 것을 써서 래퍼 클래스에 들어있는 기본형 값을 다시 꺼내는 것을 언박싱이라 한다.
    래퍼 클래스 비교는 equals를 쓴다.
     */
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); //미래에 삭제 예정, 대신에 valueOf() 사용
        Integer integerObj = Integer.valueOf(10); //-128 ~ 127 자주 사용하는 숫자값 재사용, 불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger); //toString() 재정의 됨
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longObj = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("equals: " + newInteger.equals(integerObj));
    }
}
