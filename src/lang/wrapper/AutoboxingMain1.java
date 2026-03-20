package lang.wrapper;

public class AutoboxingMain1 {
    /*
    기존 valueOf(), intValue()를 사용하지 않아도 컴파일러가 자동으로 코드를 추가해준다.
     */
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱(Auto-boxing)

        //Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토 언박싱(Auto-Unboxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
