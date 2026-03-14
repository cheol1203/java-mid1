package lang.string.immutable;

public class StringImmutable1 {
    /*
    string은 불변 객체이다. 따라서 변경이 필요한 경우 기존 값을 변경하지 않고, 대신에 새로운 결과를 만들어서 반환한다
     */
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str);
    }
}
