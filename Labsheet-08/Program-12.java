
class Container<T> {
    T value;

    void add(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class GenericContainer {
    public static void main(String[] args) {

        Container<Integer> c1 = new Container<Integer>();
        c1.add(100);
        System.out.println("Integer: " + c1.get());

        Container<String> c2 = new Container<String>();
        c2.add("Hello Java");
        System.out.println("String: " + c2.get());

        Container<Double> c3 = new Container<Double>();
        c3.add(25.5);
        System.out.println("Double: " + c3.get());
    }
}
