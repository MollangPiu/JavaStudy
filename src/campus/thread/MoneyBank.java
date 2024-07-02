package campus.thread;

public class MoneyBank {

	static int money = 10000;

	public static void main(String[] args) {
		Family mam = new Family();
		mam.setName("Mam");

		Family son = new Family();
		son.setName("Son");

		mam.start();
		son.start();
	}

}

class Family extends Thread {

	static int money = 10000;

	@Override
	public void run() {
		while (money > 0) {
			setMoney();
		}
	}

	public synchronized void setMoney() {
		try {

			Thread.sleep(500);
			System.out.println(getName() + "님이 1000원 사용. 남은 돈: " + money);
			money -= 1000;

		} catch (Exception e) {
		}
	}
}