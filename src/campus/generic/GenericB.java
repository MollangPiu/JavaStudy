package campus.generic;

public class GenericB<K, E> {
	private K key;
    private E value;
    
    public void set(K k, E e) {
        key = k;
        value = e;
    }
    
    public E get(K k) {
        if (key == null) {
            if (k == null) {
                return value;
            }
        } else if (key.equals(k)) {
            return value;
        }
        return null; // key가 일치하지 않으면 null을 반환
    }

    public static void main(String[] args) {
    	GenericB<String, String> example = new GenericB<>();
        example.set("key1", "value1");
        
        System.out.println(example.get("key1")); // "value1" 출력
        System.out.println(example.get("key2")); // null 출력
    }

}


