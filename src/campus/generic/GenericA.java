package campus.generic;

public class GenericA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericClass<String> str = new GenericClass();
		str.setValue("Hello");
		System.out.println(str.getValue());
		
		GenericClass<Integer> in = new GenericClass();
		in.setValue(100);
		System.out.println(in.getValue());
	}

}

class GenericClass<T> {
	private T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	public T getValue() {
		return this.value;
	}
}