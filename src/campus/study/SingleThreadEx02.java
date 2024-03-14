package campus.study;

public class SingleThreadEx02 implements Runnable{

    private int [] temp;

    public SingleThreadEx02(String thread) {
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

            System.out.printf("현재 쓰레드 이름: %s ", Thread.currentThread().getName());
            System.out.printf("temp value: %d %d %n", start, 2);
        }
    }

    public static void main(String[] args) {
        SingleThreadEx02 singleThreadEx = new SingleThreadEx02("superman");
        Thread t1 = new Thread(singleThreadEx);
        t1.setName("superman");
        t1.start();
    }
}
