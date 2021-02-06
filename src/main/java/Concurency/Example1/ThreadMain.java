package Concurency.Example1;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread starts");
        Thread.sleep(5000);
        System.out.println("main thread still runing ");
        Thread .sleep(3000);
        System.out.println("main threads end");

        //Thread.start
        //Thread2.start
        //Thread3.start


    }
}
