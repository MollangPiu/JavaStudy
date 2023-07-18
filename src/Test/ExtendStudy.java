package Test;

class TestA {

    TestA() {
        System.out.println("1번째: 여기가 제일 먼저");
    }

    void testA() {
        System.out.println("testA의 전유물");
    }
}

class TestB extends TestA {

    TestB() {
        super();
        System.out.println("2번째: super()는 생략이 되었다.");
    }

    void testB() {
        System.out.println("testB의 전유물");
    }
}

public class ExtendStudy {
    public static void main(String[] args) {
        TestB testB = new TestB();
        testB.testA();
        testB.testB();
    }
}
