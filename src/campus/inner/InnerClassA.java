package campus.inner;

public class InnerClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerB innerB = new InnerClassA().new InnerB();
		innerB.print();
	}

	private class InnerB {
		
		public void print() {
			System.out.println("print");
			InnerClassA.this.display();
		}
	}
	
	public void display() {
		System.out.println("display");
	}
}