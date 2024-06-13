package campus.ch10a;

public class NewClassMove {

    public static void main(String[] args) {
        ClassMove classMove = new ClassMove();

        System.out.println(classMove.intReturn());
        System.out.println(classMove.stringReturn());
        System.out.println(classMove.floatReturn());
    }
}

class ClassMove {

    int name;



    void test() {


        String movieName;

    }


    int intReturn() {

        return 5;
    }

    String stringReturn() {
        return "문자열 리턴";
    }

    float floatReturn() {
        return 3.14F;
    }


    String testString(String str) {
        System.out.println("입력된 매개변수는 "+str);

        return str;
    }


}
