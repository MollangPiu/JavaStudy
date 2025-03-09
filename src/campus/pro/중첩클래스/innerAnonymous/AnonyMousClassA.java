package campus.pro.중첩클래스.innerAnonymous;

public class AnonyMousClassA {

	public static void main(String[] args) {

		AnonyInterA anonyInterA = new AnonyInterA() {
			
			@Override
			public void print() {
				System.out.println("print 영역");
			}
			
			@Override
			public void attack() {
				System.out.println("공격");
			}
		};
	}
}