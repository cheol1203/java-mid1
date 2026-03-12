package lang.immutable.address;

public class RefMain1_2 {
    /*
    사이드 이펙트를 막기위해선 그냥 단순하게 서로 다른 인스턴스를 참조하면 된다.
    공유 참조된 객체의 필드를 변경할 때 발생하는 사이드 이펙트를 방지하기 위해 불변 객체를 활용한다.
     */
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = new Address("서울");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
