
class Box<T> {
    T value;

    Box(T value) {
        this.value = value;
    }

    void display() {
        System.out.println(value);
    }
}

public class GenericBox {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<Integer>(10);
        Box<String> b2 = new Box<String>("Hello");
        Box<Double> b3 = new Box<Double>(25.5);

        b1.display();
        b2.display();
        b3.display();
    }
}