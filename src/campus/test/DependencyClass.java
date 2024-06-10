package campus.test;

public class DependencyClass {

    public static void main(String[] args) {

        Depend01 depend01 = new Depend01();
        depend01.setName("짱구");
        depend01.setNum("10");

        Depend01 depend02 = depend01;
        System.out.println("============");
        System.out.println(depend02.getName());
        System.out.println(depend01.getName());

        System.out.println(depend01 == depend02);

        String str01 = "짱구";
        String str02 = "짱구";
        System.out.println(str01 == str02);

        String str03 = new String("짱구");
        System.out.println(str01 == str03);
        String str04 = new String(str02);
        System.out.println(str01 == str04);
        System.out.println(str02 == str04);

        String str05 = str01;
        System.out.println(str01 == str05);
        System.out.println(str02 == str05);

        System.out.println("==================");
        String str06 = str04;
        System.out.println(str01 == str06);
        System.out.println(str04 == str06);


    }
}

class Depend01 {
    private String num;
    private String name;


    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
