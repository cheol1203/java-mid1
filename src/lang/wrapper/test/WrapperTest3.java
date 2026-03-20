package lang.wrapper.test;

public class WrapperTest3 {
    /*
    String str을 Integer로 변환해서 출력해라.
    Integer를 int로 변환해서 출력해라.
    int를 Integer 로 변환해서 출력해라.
    오토 박싱, 오토 언박싱을 사용하지 말고 직접 변환해야 한다.
     */
    public static void main(String[] args) {
        String str = "100";

        //코드 작성
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        int intValue = integer1.intValue();
        System.out.println("intValue = " + intValue);

        Integer integer2 = Integer.valueOf(intValue);
        System.out.println("integer2 = " + integer2);
    }
}
