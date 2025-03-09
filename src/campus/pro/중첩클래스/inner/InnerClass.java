package campus.pro.중첩클래스.inner;

public class InnerClass {
	
	int outNum = 100;

	public static void main(String[] args) {
		//InnerB는 InnerClass안에 있으므로, InnerClass를 한 번 호출 해야 한다.
		InnerB innerB = new InnerClass().new InnerB();

		innerB.setNum(90);
		innerB.add();
	}
	
	class InnerB {
		
		String name;
		int num;
		
		public void setName(String name) {
			this.name = name;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public String getName() {
			return this.name;
		}
		public int getNum() {
			return this.num;
		}
		
		public void add() {
			outNum = 100;
			System.out.println(outNum+ num);
		}
	}

}
