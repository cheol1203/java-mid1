package lang.string.test;

public class TestString6 {
    /*
    str에서 key로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라.
    indexOf()를 반복문과 함께 풀면 된다.
     */
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        // 코드 작성
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.indexOf(key ,i)!=-1){
                i=str.indexOf(key ,i);
                count++;
            }
        }
        /* 더 좋은 코드
        int index = str.indexOf(key);
        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;
        }
         */
        System.out.println("count = " + count);
    }

}