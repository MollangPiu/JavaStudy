package campus.thread;

public class Thread01 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread01 thread01 = new Thread01();
		thread01.run();
		
		Thread01 thread02 = new Thread01();
		thread02.run();
	}
	
	@Override
	public void run() {
		for(int i= 0; i < 10; i++) {
			System.out.println("name: "+i+"번째");
			try {
			Thread.sleep(1000);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
