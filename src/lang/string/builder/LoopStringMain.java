package lang.string.builder;

public class LoopStringMain {
    /*
    간단한 문자열 결합은 자바에서 알아서 최적화를 해준다.
    하지만 여러번 반복되는 for문에서는 반복횟수마다 객체를 생성하므로 비효율적이다
    따라서 이럴때는 가변 객체 StringBuilder를 사용한다.
     */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java ";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
