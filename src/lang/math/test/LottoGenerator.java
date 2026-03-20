package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    /*
    로또 번호를 자동으로 만들어주는 자동 생성기를 만들자
    로또 번호는 1~45 사이의 숫자를 6개 뽑아야 한다.
    각 숫자는 중복되면 안된다.
    실행할 때 마다 결과가 달라야 한다.
     */
    public static void main(String[] args) {
        Random random = new Random();

        System.out.print("로또 번호:");

        int count = 0;
        int[] arr = new int[46];
        while(count < 6){
            int i = random.nextInt(45) + 1;
            if(arr[i] >= 1){
                continue;
            } else {
                arr[i]++;
                count++;
                System.out.print(" " + i);
            }
        }
    }
}
