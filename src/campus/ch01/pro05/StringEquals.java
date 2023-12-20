package campus.ch01.pro05;

import java.io.IOException;

public class StringEquals {

    public static void main(String[] args) {

        String newString = new String("문장을 입력합니다.");
        System.out.println(newString);

        String firstString = new String("String 첫 번째 생성 방법");
        String secondString = "String 두 번째 생성 방법";

        System.out.println(firstString);
        System.out.println(secondString);

        
        String str1 = "apple";
        String str2 = "orange";
        String str3 = "apple";

        //문자 비교 방법
        System.out.println(str1 == str2);       //x
        System.out.println(str1.equals(str2));  //o

        System.out.println(str1 == str3);       //true(사용 x)
        System.out.println(str1.equals(str3));  //true(사용 o)

        String newStr = new String("apple");
        System.out.println(str1 == newStr);         //apple == apple
        System.out.println(str1.equals(newStr));    //apple.equals("apple")

        System.out.println("================================");

        //대, 소문자 구분없이 문자열 내용이 같은지 여부 체크하기기
        String str4 = "ORANGE";
        System.out.println(str2.equalsIgnoreCase(str4));
        System.out.println(str4.equalsIgnoreCase(str2));

        
        System.out.println("================================");
        //특수문자 사용하기
        System.out.println("가나다라마바사\n아자차카타파하");
        System.out.println("가나다라마바사\t아자차카타파하");
        System.out.println("가나다라마바사\'아자차카타파하\'");
        System.out.println("가나다라마바사\\아자차카타파하\\");

        System.out.println("================================");
        //QUIZ
        String quiz1 = "JAVA";
        String quiz2 = "C##";
        String quiz3 = "JAVA";
        String quiz4 = new String("JAVA");
        System.out.println(quiz1 == quiz3);
        System.out.println(quiz1 == quiz2);
        System.out.println(quiz1.equals(quiz3));
        System.out.println(quiz1.equals(quiz2));
    }

}
