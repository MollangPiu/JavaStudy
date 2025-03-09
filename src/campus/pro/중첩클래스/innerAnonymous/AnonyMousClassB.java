package campus.pro.중첩클래스.innerAnonymous;

class AnonyB {
	public void print() { };
}

public class AnonyMousClassB {
	
	AnonyB anonyB = new AnonyB() {
		
		@Override
		public void print() {
			System.out.println("print");
		}
	};
	
	public void display() {
		anonyB.print();
	}
	

	public static void main(String[] args) {
		
		AnonyMousClassB anonyMousClassB = new AnonyMousClassB();
		anonyMousClassB.display();
	}
}
