package lang.string.method;

public class StringSplitJoinMain {
    /*
    문자열 분할 및 조합 메서드
     */
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split()

        String[] splitStr = str.split(",");
        for(String s : splitStr) {
            System.out.println(s);
        }

        // join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열: " + joinedStr);

        // 문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}
