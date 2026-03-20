package lang.clazz;

public class ClassCreateMain {
    /*
    클래스 정보를 바탕으로 인스턴스 생성하기 -- 리플렉션
     */
    public static void main(String[] args) throws Exception {
        //Class helloClass = Hello.class;
        Class helloClass = Class.forName("lang.clazz.Hello");
        Hello hello = (Hello)helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
