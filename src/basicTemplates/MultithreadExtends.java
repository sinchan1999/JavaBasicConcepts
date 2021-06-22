package basicTemplates;

// Multi-threading by extending Thread class
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<20000){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am making Biryani");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<20000){
            System.out.println("My Playing thread is running !");
            System.out.println("I am playing CHESS");
            i++;
        }
    }
}

class MyThread3 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<20000){
            System.out.println("My swimming thread is running");
            System.out.println("I am SWIMMING!");
            i++;
        }
    }
}

class MyThread4 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<20000){
            System.out.println("My sleeping thread is running");
            System.out.println("I am SLEEPING!");
            i++;
        }
    }
}
/*In multi-thearding sequence is not strictly maintained . To get better idea we can make the loops
infinite or too large */
public class MultithreadExtends {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        MyThread4 t4 = new MyThread4();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
