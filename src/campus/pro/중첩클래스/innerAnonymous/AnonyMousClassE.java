package campus.pro.중첩클래스.innerAnonymous;

class AnonyE {
	public void print() { System.out.println("default"); }
}

public class AnonyMousClassE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonyMousClassE anonyMousClassE = new AnonyMousClassE();
		anonyMousClassE.print(new AnonyE());
		anonyMousClassE.print(new AnonyE() {
			@Override
			public void print() {
				System.out.println("inner");
				attack();
			}
			
			public void attack() {
				System.out.println("attack");
			}
		});
	}
	
	public void print(AnonyE anonyE) {
		anonyE.print();
	}
}
