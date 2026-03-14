package lang.string.chaining;

public class MethodChainingMain2 {
    /*
    StringBuilder 대부분의 메서드도 자기 자신을 반환하므로 메서드 체이닝 기법을 제공한다.
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4, "Java")
                .delete(4, 8)
                .reverse()
                .toString();
        System.out.println("string = " + string);
    }
}
