package lang.object.poly;

public class ObjectPolyExample2 {
    /*
    Object는 모든 타입의 객체를 담을 수 있기에 모든 객체를 담을 수 있는 배열을 만들 수 있다.
     */
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object= new Object(); //Object 인스턴스도 만들 수 있다.

        Object[] objects = {dog, car, object};

        size(objects);
    }

    private static void size(Object[] objects){
        System.out.println("전달된 객체의 수는: " + objects.length);
    }
}