
class Product<T, U> {
    T id;
    U price;

    Product(T id, U price) {
        this.id = id;
        this.price = price;
    }

    void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Price: " + price);
        System.out.println();
    }
}

public class ProductPair {
    public static void main(String[] args) {
        Product<Integer, Double> p1 =
            new Product<Integer, Double>(101, 250.50);

        Product<Integer, Double> p2 =
            new Product<Integer, Double>(102, 499.99);

        Product<Integer, Double> p3 =
            new Product<Integer, Double>(103, 799.00);

        p1.display();
        p2.display();
        p3.display();
    }
}