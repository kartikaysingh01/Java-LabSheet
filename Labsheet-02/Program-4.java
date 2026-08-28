import java.util.Scanner;

class VisitorCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int visitors = 0;

        System.out.print("Enter number of visitors entering: ");
        int entering = sc.nextInt();

        for (int i = 0; i < entering; i++) {
            System.out.println("Visitor entered. Count = " + (++visitors));
        }

        System.out.print("Enter number of visitors leaving: ");
        int leaving = sc.nextInt();

        for (int i = 0; i < leaving; i++) {
            System.out.println("Visitor left. Count = " + (visitors--));
        }

        System.out.println("Final visitor count = " + visitors);

        sc.close();
    }
}