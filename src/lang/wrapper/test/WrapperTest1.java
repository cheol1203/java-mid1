package lang.wrapper.test;

public class WrapperTest1 {
    /*
    문자로 입력된 str1, str2 두 수의 합을 구하자.
     */
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        // 코드 작성
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int sum = a + b;

        System.out.println("두수의 합: " + sum);
    }
}
