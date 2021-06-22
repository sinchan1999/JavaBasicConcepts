package basicTemplates;

//Multi-threading by using Runnable Interface .
class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while (i<30000) {
            System.out.println("I am a thread 1 , I am COOKING ");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while (i<30000) {
            System.out.println("I am a thread 2 , I am RIDING bike");
            i++;
        }

    }
}

class MyThreadRunnable3 implements Runnable{
    public void run(){
        int i=0;
        while (i<30000) {
            System.out.println("I am a thread 3 , I am capturing PHOTOS");
            i++;
        }

    }
}

public class multithreadRunnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        MyThreadRunnable3 bullet3 = new MyThreadRunnable3();
        Thread gun3 = new Thread(bullet3);

        gun1.start();
        gun2.start();
        gun3.start();
    }
}
