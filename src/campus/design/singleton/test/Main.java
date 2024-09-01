package campus.design.singleton.test;

class Main {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        
        if(singleton1 == singleton2) {
            System.out.println("같나요");
        } else {
            System.out.println("다른가요");
        }
    }
}
