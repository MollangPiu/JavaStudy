package campus.pro.중첩클래스.inner;

public class LocalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalClass localClass = new LocalClass();
		localClass.method();
	}
	
	public void method() {
		class InnerB {
			int num;
			
		}
		
		InnerB innerB = new InnerB();
		innerB.num = 10;
		System.out.println(innerB.num);
	}

}
