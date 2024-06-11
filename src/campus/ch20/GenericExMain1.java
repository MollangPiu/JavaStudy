package campus.ch20;

public class GenericExMain1 {

    public static void main(String[] args) {
        GenericEx1<String> t = new GenericEx1<>();

        String [] arr = {"가", "나", "다"};

        t.set(arr);
        t.print();
    }
}
