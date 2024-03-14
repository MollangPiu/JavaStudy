package campus.study;

public class SingleThreadEx extends Thread{

    private int [] temp;

    public SingleThreadEx(String thread) {
        super(thread);
        temp = new int[10];
        for(int start = 0; start < temp.length; start++) {
            temp[start] = start;
        }
    }

    public void run() {
        for(int start : temp) {
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
                e.printStackTrace();
            }

            System.out.printf("현재 쓰레드 이름: %s ", currentThread().getName());
            System.out.printf("temp value: %d %d %n", start, 2);
        }
    }

    public static void main(String[] args) {
        SingleThreadEx singleThreadEx = new SingleThreadEx("superman");
        singleThreadEx.start();
    }
}
