package lang.object;

public class ObjectMain {
    /*
    Object 클래스는 모든 클래스의 부모 클래스이다.
        - 공통 기능 제공
        - 다형성의 기본 구현
     */
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString()은 Object 클래스의 메서드
        String string = child.toString();
        System.out.println(string);
    }
}
