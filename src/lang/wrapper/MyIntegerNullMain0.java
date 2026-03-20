package lang.wrapper;

public class MyIntegerNullMain0 {
    /*
    기본형의 한계2 : 때로는 데이터가 '없음'이라는 상태가 필요하다.
    하지만 기본형은 항상 값을 가진다.
     */
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1)); //-1
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); //-1
    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
}
