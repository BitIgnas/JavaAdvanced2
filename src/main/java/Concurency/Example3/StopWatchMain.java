package Concurency.Example3;

public class StopWatchMain {
    public static void main(String[] args) {
        Example3 chronometer1 = new Example3("c1");
        chronometer1.start();

        Example3 chronometer2 = new Example3("c2");
        chronometer2.start();

        System.out.println("Main thread starts");

        try {
            Thread.sleep(4000);
            System.out.println("Main thread is running again");
            Thread.sleep(2000);
            System.out.println("Main thread ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
