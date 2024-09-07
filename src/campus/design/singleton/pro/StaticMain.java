package campus.design.singleton.pro;

class StaticMain {

    public static String DATA = "Hello";
}

class Main {
    public static void main(String[] args) {
        StaticMain.DATA = "Hello World";
        System.out.println(StaticMain.DATA);
    }
}
