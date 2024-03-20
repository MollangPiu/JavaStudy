package campus.exam;

public class StringMain {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "Computer";
        str1="Computer";
        String str3 = new String("Computer");
        String str4 = "apple";

        System.out.println(str1 == str2);
        System.out.println(str1 == str4);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
    }
}
