class Fibonacci {

    static int seriesCount = 0;

    void generateSeries(int n) {

        seriesCount++;

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
        System.out.println("Series Count = " + seriesCount);
    }

    public static void main(String[] args) {

        Fibonacci f = new Fibonacci();

        f.generateSeries(10);
    }
}