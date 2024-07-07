package campus.innerAnonymous;

class AnonyC {
	public void print() { }
}

public class AnonyMousClassC {

	public static void main(String[] args) {

		AnonyC anonyC = new AnonyC() {
			@Override
			public void print() {
				System.out.println("print");
				attack(); // 동일 class 안의 method 호출하기
			}
			
			//같은 class 내부에서는 사용할 수 있다.
			public void attack() {
				System.out.println("attack");
			}
		};
		
		anonyC.print();
		
		//동적 바인딩 개념이므로, 오버라이드 된 것만 사용 할 수 있다.
		//anonyC.attack();
	}
}
