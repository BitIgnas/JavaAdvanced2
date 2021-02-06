package Concurency.Example3;

public class Example3 extends Thread {

    private String prefix;

    public Example3(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public void run() {
       for(int i = 0; i < 10; i++){
           System.out.println(prefix + " Stop watch: " + i);

           try {
               Thread.sleep(1000); //Stopping thread 1 sec
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
