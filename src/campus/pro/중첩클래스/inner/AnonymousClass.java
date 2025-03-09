package campus.pro.중첩클래스.inner;

public class AnonymousClass {

	public static void main(String[] args) {
		
		AnonyMousInter anonyMousInter = new AnonyMousInter() {
			
			@Override
			public void print() {
				System.out.println("Hello World");
				
			}
			
			@Override
			public int add(int numA, int numB) {
				return numA+numB*2;
			}
		};
		
		anonyMousInter.print();
		int result = anonyMousInter.add(100, 500);
		System.out.println("합계: "+result);
	}
	

}
