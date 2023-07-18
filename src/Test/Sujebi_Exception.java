package Test;

class Test_Exception{

    void testException() throws ArrayIndexOutOfBoundsException{

        System.out.println("Exception 기능이 있는 method 입니다.");
    }

    void nomailMethod() {
        System.out.println("Exception이 없다.");
    }
}

public class Sujebi_Exception {

    public static void main(String[] args) {

        try {
            Test_Exception test_exception = new Test_Exception();
            test_exception.nomailMethod();
            test_exception.testException();
        }
        catch (ArrayIndexOutOfBoundsException e) {

        }
        finally {

        }
    }
}
