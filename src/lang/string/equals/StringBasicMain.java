package lang.string.equals;

public class StringBasicMain {
    /*

     */
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교: " + (str1 == str2)); //다른 주소값 참조하므로 false
        System.out.println("new String() equals 비교: " + (str1.equals(str2))); //논리적으로 같으므로 true
        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        // string을 리터럴로 선언할 시 문자열 풀에 저장, 자바 실행 시점에 문자열 리터럴이 있으면 문자열 풀에 String 인스턴스를 미리 만듦
        // 같은 문자열이 있으면 만들지 않음 따라서 똑같은 문자열 리터럴이 재선언되면 같은 참조를 사용한다. 따라서, true
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4))); //논리적으로 같으므로 true
    }
}
