package lang.immutable.address;

public class RefMain2 {
    /*
    불변 객체 : 객체의 상태(필드, 멤버 변수)가 변하지 않는 객체
    - 어떻게든 필드 값을 변경할 수 없게 클래스를 설계하면 됨
    - 생성자를 통해서만 값을 설정할 수 있음
    ex) 필드를 final로 설정하거나 set함수를 삭제하거나
     */
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법이 없다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b.setValue("부산"); //컴파일 오류 발생
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}