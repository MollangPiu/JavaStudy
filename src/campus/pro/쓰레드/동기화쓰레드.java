package campus.pro.쓰레드;

public class 동기화쓰레드 {

    private int money = 0;
    private int sharedMoney = 10000;

    public static void main(String[] args) {
        동기화쓰레드 moneySharing = new 동기화쓰레드();
        Thread mamThread = new Thread(() -> moneySharing.takeMoney("Mam"));
        Thread sonThread = new Thread(() -> moneySharing.takeMoney("Son"));
        Thread dadThread = new Thread(() -> moneySharing.takeMoney("Dad"));

        Thread superMan = new Thread(new Runnable() {
            @Override
            public void run() {
                moneySharing.takeMoney("superMan");
            }
        });

        mamThread.start();
        sonThread.start();
        dadThread.start();
        superMan.start();

        System.out.println("hi");
    }

    private synchronized void takeMoney(String name) {
        while (sharedMoney >= 1000) {

            sharedMoney -= 1000;
            this.money += 1000;
            System.out.println(name + " took 1000원, remaining money: " + sharedMoney + "원");


            try {
                Thread.sleep(1000);
                if (sharedMoney >= 1000) {
                    notify(); // 권한을 다른 스레드에게 넘김
                    wait(); // 다른 스레드가 작업을 완료할 때까지 대기
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private int getMoney() {
        return money;
    }
}
