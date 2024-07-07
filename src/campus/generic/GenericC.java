package campus.generic;

public class GenericC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClassC<Integer> in = new GenericClassC(10);
		in.set(0, 100);
		in.set(1, 200);

		System.out.println(in.get(0));
		System.out.println(in.get(1));
		
		GenericClassC<String> str = new GenericClassC(10);
		str.set(0, "Hello");
		str.set(1, "World");
		
		System.out.println(str.get(0));
		System.out.println(str.get(1));
	}

}

class GenericClassC<E> {
    private E[] arr;

    // 생성자
    public GenericClassC(int num) {
        arr = (E[]) new Object[num]; // Object 배열을 제네릭 타입으로 캐스팅
    }

    // 배열에 요소를 설정하는 메소드
    public void set(int index, E value) {
        arr[index] = value;
    }

    // 배열에서 요소를 가져오는 메소드
    public E get(int index) {
        return arr[index];
    }
} 