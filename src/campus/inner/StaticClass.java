package campus.inner;

public class StaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerB innerB = new InnerB();

		innerB.name = "가나다";
		System.out.println(innerB.name);
		
		innerB.printA();
		InnerB.PrintB();
	}

	static class InnerB {
		String name;
		int num;
		
		public void printA() {
			System.out.println("Print - A");
		}
		
		public static void PrintB() {
			System.out.println("Print - B");
		}
	}
}
