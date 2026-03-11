package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;
    public UserV2(String id) {
        this.id = id;
    }

    /*
    현재 인스턴스에 있는 id와 비교 대상으로 넘어온 객체의 id를 비교
    Object에는 id변수가 없으므로 다운캐스팅 필요
     */
//    @Override
//    public boolean equals(Object obj) {
//        UserV2 user = (UserV2) obj;
//        return id.equals(user.id);
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }
}
