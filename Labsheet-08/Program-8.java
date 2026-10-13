
public class ThreeValues {

    public static <T> void display(T a, T b, T c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();
    }

    public static void main(String[] args) {
        display(10, 20, 30);

        display("Java", "Python", "C++");

        display(10.5, 20.5, 30.5);
    }
}
