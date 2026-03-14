package lang.string.builder;

public class StringBuilderMain1_1 {
    /*
    불변 string은 문자를 더하거나 변경할 때마다 새로운 객체가 생성되어 메모리적으로 비효율적
    -> 가변 string을 사용
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4,"Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);
        
        sb.reverse();
        System.out.println("reverse = " + sb);
        
        //StringBuilder -> String
        //가변 string은 사이드 이펙트가 발생할 수 있으므로 안전한 불변 string으로 변경
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
