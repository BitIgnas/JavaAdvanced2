package Concurency.Example2;

public class ThreadExample2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Number of active threads: " + Thread.activeCount());

        SimpleThread simpleThread;

        for(int counter = 0;counter < 10; counter++ ){
            simpleThread = new SimpleThread("T_" + counter); //T_0, T_1
            simpleThread.run();
        }
    }
}

class SimpleThread extends  Thread{

    public SimpleThread(String name) {
        super(name);
    }

    //start() method creates thread and invokes run() method
    @Override
    public void run() {
        System.out.println("Thread: " + getName() + " running");
    }
}



