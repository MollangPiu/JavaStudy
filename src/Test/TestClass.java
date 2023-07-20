package Test;



public class TestClass implements TestInter{

    //Class
    class InnerClass {

        //생성자
        InnerClass() {
            System.out.println("클래스 안의 클래스");
        }

    }

    public String test() {
        dkdkdk();
        new InnerClass();
        return "test1";
    }

    void dkdkdk() {
        System.out.println("아아아");
    }


    public static void main(String[] args) {

        System.out.println(new TestClass().test());
        System.out.println(new TestClass().new InnerClass());
    }
}
