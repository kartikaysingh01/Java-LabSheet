class Product {

    int id;
    String name;
    double price;

    static double discountRate = 10;

    void calculatePrice() {

        int productId = 101;
        String productName = "Laptop";
        double productPrice = 50000;

        id = productId;
        name = productName;
        price = productPrice;

        double discount = (price * discountRate) / 100;
        double finalPrice = price - discount;

        System.out.println("Product ID = " + id);
        System.out.println("Product Name = " + name);
        System.out.println("Price = " + price);
        System.out.println("Discount = " + discount);
        System.out.println("Final Price = " + finalPrice);
    }

    public static void main(String[] args) {

        Product p = new Product();

        p.calculatePrice();
    }
}