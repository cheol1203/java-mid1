package lang.object.tostring;

public class ToStringMain1 {
    /*
    System.out.println()에는 내부적으로 toString()이 호출되어 같은 값이 호출된다.
     */
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString() 반환값 출력
        System.out.println(string);

        //object 직접 출력
        System.out.println(object);
    }
}
