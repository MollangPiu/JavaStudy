package campus.thread;

public class MoneySharing {
    private int sharedMoney = 10000;

    public static void main(String[] args) {
        MoneySharing moneySharing = new MoneySharing();
        Thread mamThread = new Thread(() -> moneySharing.takeMoney("Mam"));
        Thread sonThread = new Thread(() -> moneySharing.takeMoney("Son"));

        mamThread.start();
        sonThread.start();
    }

    private synchronized void takeMoney(String name) {
        while (sharedMoney >= 1000) {
        	
            sharedMoney -= 1000;
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
}
