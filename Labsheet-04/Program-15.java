class SimpleInterest {

    double principal;
    double rate;
    double time;

    static String bank = "SBI";

    void calculateInterest() {

        double p = 10000;
        double r = 5;
        double t = 2;

        principal = p;
        rate = r;
        time = t;

        double interest = (principal * rate * time) / 100;

        System.out.println("Bank = " + bank);
        System.out.println("Principal = " + principal);
        System.out.println("Rate = " + rate + "%");
        System.out.println("Time = " + time + " years");
        System.out.println("Simple Interest = " + interest);
    }

    public static void main(String[] args) {

        SimpleInterest s = new SimpleInterest();

        s.calculateInterest();
    }
}