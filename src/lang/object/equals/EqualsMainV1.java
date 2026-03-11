package lang.object.equals;

public class EqualsMainV1 {
    /*
    동일성 : == 연산자를 통해 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
    동등성 : equals() 메서드를 사용하여 두 객체가 논리적으로 동등한지 확인
    equals()는 ==으로 동일성 비교를 제공한다.
     */
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + user1.equals(user2));
        //오버라이딩을 하지 않고 equals를 썼으므로 ==연산과 같다.
    }
}
