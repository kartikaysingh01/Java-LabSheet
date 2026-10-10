class MyThread extends Thread {
    public void run() {
        int sum = 0;

        for (int i = 1; i <= 10000; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {

        MyThread t = new MyThread();

        t.start();
        t.join();

        System.out.println("Task finished");
    }
}