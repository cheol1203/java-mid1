package enumeration.ex2;

public enum Grade {
    BASIC, GOLD, DIAMOND

    //다음코드와 같이 동작한다.
    /*public class Grade extends Enum {
        public static final Grade BASIC = new Grade();
        public static final Grade GOLD = new Grade();
        public static final Grade DIAMOND = new Grade();

        //private 생성자 추가
        private Grade() {}
    }*/
}
