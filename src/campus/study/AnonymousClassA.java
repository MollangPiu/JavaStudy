package campus.study;

public class AnonymousClassA {

    public static void main(String[] args) {

        Anony anony = new Anony() {

            @Override
            public void print() {
                System.out.println("gogo");
            }

        };

        anony.print();

    }
}


class Anony {
    public void print() {
        System.out.println("test");
    }
}