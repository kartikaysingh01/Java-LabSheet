class Buffer {
    int number;
    boolean available = false;

    synchronized void produce(int n) throws InterruptedException {
        while (available) {
            wait();
        }

        number = n;
        available = true;

        System.out.println("Produced: " + n);
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!available) {
            wait();
        }

        System.out.println("Consumed: " + number);
        available = false;

        notify();
    }
}

class Producer extends Thread {
    Buffer b;

    Producer(Buffer b) {
        this.b = b;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                b.produce(i);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Consumer extends Thread {
    Buffer b;

    Consumer(Buffer b) {
        this.b = b;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                b.consume();
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Buffer b = new Buffer();

        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        p.start();
        c.start();
    }
}