package campus.test;

public class Dependen {

    public static void main(String[] args) {

        String str1 = "가나다";
        String str2 = "가나다";

        System.out.println(str1 == str2);

        String str3 = new String();
        System.out.println(str1 == str3);

        String str4 = str3;
        System.out.println(str3 == str4);

    }
}
