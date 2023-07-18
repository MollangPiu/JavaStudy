package Test;

class Thread_Test extends Thread {
    public void run() {
        System.out.println("Run");
    }
}

public class Sujebi_Threed {

    public static void main(String[] args) {
        Thread t1 = new Thread_Test();
        Thread t2 = new Thread(new Thread_Test());
        
        t1.start();
        t2.start();
        System.out.println("Main");
    }
}
