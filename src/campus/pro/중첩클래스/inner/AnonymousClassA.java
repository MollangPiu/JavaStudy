package campus.pro.중첩클래스.inner;

public class AnonymousClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnonymousClassA anonymousClass = new AnonymousClassA();
		anonymousClass.anno.attack();

	}
	
	Anony anno = new Anony() {
		String name = "피카츄";
		
		public void skill() {
			System.out.println("100만 볼트");
		}
		
		@Override
		public void attack() {
			System.out.println("전광 석화");
		}
		
	};

}

class Anony {
	
	public void attack() {
		System.out.println("공격");
	}

}
