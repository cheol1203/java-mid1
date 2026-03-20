package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    /*
    Class 클래스 : 클래스의 정보(메타데이터)를 다루는데 사용된다.
    1. 타입 정보 얻기
    2. 리플렉션 : 클래스에 정의된 메서드, 필드, 생성자 등을 조회하고, 이들을 통해 객체 인스턴스를 생성하거나 메서드를 호출하는 등의 작업을 할 수 있다.
    3. 동적 로딩과 생성 : Class.forName() 을 사용해 클래스를 동적으로 로드, newInstance()를 통해 새 인스턴스를 생성할 수 있다.
    4. 애노테이션 처리
     */
    public static void main(String[] args) throws Exception {
        //Class 조회
        Class clazz = String.class; // 1. 클래스에서 조회
        //Class clazz = new String().getClass(); // 2. 인스턴스에서 조회
        //Class clazz = Class.forName("java.lang.String"); // 3. 문자열로 조회 , 예외처리 필요

        //모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getType() + " " + field.getName());
        }
        
        //모든 메서드 출력
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        //상위 클래스 정보 출력
        System.out.println("Superclass: " + clazz.getSuperclass().getName());

        //인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("Interface: " + i.getName());
        }
    }
}
