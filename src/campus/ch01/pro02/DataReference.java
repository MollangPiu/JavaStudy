package campus.ch01.pro02;

class DataReference {

    public static void main(String[] args) {
        System.out.println("Hello World");

        String str = "Hello World";
        str = "car";
        str = "apple";


        System.out.println(str);

        str = "apple";
        System.out.println(str);

        str = "car";
        System.out.println(str);

        str = "banana";
        System.out.println(str);

    }
}
