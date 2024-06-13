package campus.ch10.question;

/**
 * 생성자를 통해서 값 넣기
 */
public class Construct02 {

    public static void main(String[] args) {
        Human human01 = new Human();
        human01.pirnt();

        Human human02 = new Human("짱구");
        human02.pirnt();

        Human human03 = new Human("홍길동", 18);
        human03.pirnt();
    }

}

class Human {

    String name;
    int age;

    Human() {
        this.name = "none";
        this.age = 0;
    }

    Human(String name) {
        this.name = name;
        this.age = 0;
    }
    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void pirnt() {
        System.out.println("이름: "+this.name);
        System.out.println("나이: "+this.age);
    }
}
