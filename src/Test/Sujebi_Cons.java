package Test;


//A 클레스
class ConsA {
}

//B 클레스
class ConsB extends ConsA{

    //얘는 무조건 생략

    /**
     * 생성자는 매게변수가 빈값인 생성자는 무조건 default로 생성 된다.
     * 단, 생성자를 커스텀을 할 경우에는 default로 만들어진 생성자는 자동으로 사라진다.
     * 오버로딩 된 생성자 또한 포함된다.
     */
    ConsB(int cnt) {
        super();
    }
    ConsB(String str) {
    }
}

public class Sujebi_Cons {

    public static void main(String[] args) {
        ConsB consB = new ConsB(5);
        new ConsB("str");
        new ConsB();
    }
}
