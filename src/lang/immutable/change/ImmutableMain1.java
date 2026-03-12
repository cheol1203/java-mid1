package lang.immutable.change;

public class ImmutableMain1 {
    /*
    불변 객체를 사용하지만 그래도 값을 변경해야 하는 메서드가 필요하면 어떻게 해아할까?
    -> 기존 값은 변경하지 않고 대신에 계산결과를 바탕으로 새로운 객체를 만들어 반환
     */
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);

        System.out.println("obj1 = " + obj1.getValue());
        System.out.println("obj2 = " + obj2.getValue());
    }
}
