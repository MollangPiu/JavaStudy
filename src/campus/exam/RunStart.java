package campus.exam;

public class RunStart implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        RunStart runableMain = new RunStart();
        Thread thread1 = new Thread(runableMain, "superman");
        thread1.start();

    }
}
