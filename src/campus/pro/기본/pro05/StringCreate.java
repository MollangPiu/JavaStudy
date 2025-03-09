package campus.pro.기본.pro05;

class StringCreate {

    public static void main(String[] args) {

        String str = "Don't doubt yourself There is no" +
                "place for certainty where there is doubt.";
        System.out.println(str);

        System.out.println("==============================");

        //대문자로 정의
        System.out.println(str.toUpperCase());

        //소문자로 정의
        System.out.println(str.toLowerCase());

        System.out.println("==============================");
        //문장 존재를 찾는다. 대, 소문자 구분한다.
        System.out.println(str.contains("your"));       //true
        System.out.println(str.contains("YOUR"));       //false
        System.out.println(str.contains("Campus"));     //false
        System.out.println(str.contains(" "));          //true 공백 또한 검색 대상이다.

        System.out.println("==============================");
        //문자의 위치를 찾아보자.
        System.out.println(str.indexOf("your"));        //true, 12
        System.out.println(str.indexOf("YOUR"));        //false, -1
        System.out.println(str.indexOf("Campus"));      //false, -1
        System.out.println(str.indexOf(" "));           //true, 5
        //true, (10이후에는 11이 제일 가깝다.)
        System.out.println(str.indexOf(" ", 10));

        System.out.println(str.startsWith("Don"));  //문장의 시작을 비교한다.
        System.out.println(str.endsWith("."));      //문장의 종료를 비교한다.

        System.out.println(str.toLowerCase().contains("your"));
        System.out.println(str.toUpperCase().contains("YOUR"));
        System.out.println(str.toLowerCase().indexOf("your"));
        System.out.println(str.toUpperCase().indexOf("YOUR"));

        System.out.println("==============================");

        //문자열 자르기
        str = "If you do as you always do, you get what you always get.";
        System.out.println(str);
        System.out.println(str.replace("do", "smile"));

        System.out.println(str.substring(28));
        System.out.println(str.substring(0, 26));

        //do를 smile로 모두 변경


        System.out.println("==============================");

        //문제
        str = "We will make it. As always.";
        System.out.println(str);






        // As always를 제외하고 표현하기
        System.out.println(str.substring(0, str.indexOf(".")));


        System.out.println("==============================");

        str = "HAPPY";
        System.out.println("length: "+str.length());

        str = "Congratulations";
        System.out.println("length: "+str.length());

        System.out.println("==============================");

        //공백 제거
        str = "       Happy    Happy        ";
        System.out.println(str);
        System.out.println(str.trim());

        System.out.println("==============================");

        //문자 사이에 원하는 글자 넣기
        String str1 = "Super";
        String str2 = "User";
        System.out.println(str1+str2);
        System.out.println(str1.concat(str2));
        System.out.println(str1.concat(" / ").concat(str2));


        System.out.println("==============================================");

        String testA = "apple";
        System.out.println(testA.equals("apple"));
        String testB = "banana";
        System.out.println(testA == testB);
        System.out.println("apple" == testA);

        String testC = "apple";
        System.out.println(testA == testC);


        System.out.println("===============================================");
        str = "POSITION";
        System.out.println(str);        //POSITION

        System.out.println("===============================================");
        testA = "apple";
        testB = "apple";
        testC = new String("apple");
        String testD = "apple";

        System.out.println(testA == testB);
        System.out.println(testA == testC);
        System.out.println(testB == testC);
        System.out.println(testA == testD);
        System.out.println(testC == testD);

    }
}
