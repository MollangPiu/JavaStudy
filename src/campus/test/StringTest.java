package campus.test;

public class StringTest {

    public static void main(String[] args) {

        String str1 = "HelloWorld"; //StringPool 저장.
        String str2 = "HelloWorld"; //StringPool 저장하려고 봤더니, 이미 있떠라~ 그래서 위의 주소를 갖고 온다.

        System.out.println(str1 == str2);
        String st1 = new String("사과");  //메모리 Heap에다가 저장. String Pool x
        String st2 = "사과";                      //String Pool에 저장.
        System.out.println(st1 == st2);

        StringTest stringTest = new StringTest();
        System.out.println(stringTest);
        stringTest.print();

        new StringTest().print();
        //test
    }

    public void print() {
        System.out.println("Print");
    }


}
