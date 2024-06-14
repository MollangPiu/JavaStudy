package campus.ch10;

public class Overroding {

    public void print() {
        System.out.println("입력하기");
    }

    public void print(String name) {
        System.out.println("이름은? "+name);
    }

    public void print(int age) {
        System.out.println("당신의 나이는? "+age);
    }

    public static void main(String[] args) {
        Overroding overroding = new Overroding();
        overroding.print();
        overroding.print("홍길동");
        overroding.print(18);
    }
}
