package demo1.thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    distributor distributor = new distributor();
        Thread thread1 = new Thread(distributor::distributorVoid);
        Thread thread2 = new Thread(distributor::waiter);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

    }
}
