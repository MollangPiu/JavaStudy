package campus.pro.중첩클래스.innerAnonymous;

//AnonyMousClass 대상
class AnonyD {
	public void print() {
		System.out.println("printD");
	}
}

//Main Class
public class AnonyMousClassD {

	public static void main(String[] args) {
		
		//method에서 선언 된 AnonyMous Class
		AnonyD anonyD = new AnonyD() {
			@Override
			public void print() {
				System.out.println("Inner");
			}
		};
		
		anonyD.print();

	}
}
