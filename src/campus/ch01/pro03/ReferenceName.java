package campus.ch01.pro03;

public class ReferenceName {

    public static void main(String[] args) {

        String snake_case = "Snake Case";   //Snake Case
        String camelCase = "Camel Case";    //Camel Case


        System.out.println("===========================");
        String name = "철수";
        int korScore = 100;
        int engScore = 80;
        int mathScore = 85;
        System.out.println(name+"는 국어점수가 "+korScore+"점 이야");
        System.out.println(name+"는 영어점수가 "+engScore+"점 이야");
        System.out.println(name+"는 수학점수가 "+engScore+"점 이야");


        System.out.println("===========================");
        System.out.println(name+"의 총 점수는 "+(korScore+engScore+mathScore)+"점 이야");
        System.out.println(korScore+engScore+mathScore);

        System.out.println("===========================");

        String str1 = "문장의시작을나타내는글";
        String str2 = "JAVA공부";
        System.out.println(str1+str2);

        System.out.println("===========================");

        //강제 형변환
        double doScore = 95.8;
        int inScore = 80;

        System.out.println((int)doScore);
        System.out.println((double)inScore);

        System.out.println("두 개의 합은 "+(int)(doScore+inScore));
        System.out.println("두 개의 합은 "+doScore+inScore);

        System.out.println("===========================");
        //함수를 사용한 형변환

        int testNum = 100;
        String strNum = "80";

        System.out.println(testNum+strNum);
        System.out.println(Integer.valueOf(strNum)+testNum);
        System.out.println(Integer.parseInt(strNum)+testNum);

        System.out.println("===========================");

        final String COMPUTER_LANGUAGE = "JAVA";
        System.out.println(COMPUTER_LANGUAGE);

        System.out.println("===========================");

        //QUIZ - 1
        String number1 = "7";
        int number2 = 3;
        int number3 = 4;
        System.out.println(number1+number2+number3);
        System.out.println(number2+number3+number1);


        System.out.println("===========================");
        //QUIZ - 2
        String stuName = "영희";
        String scoolName = "푸른초등학교";
        String busNo = "마을 05번";
        int busMoney = 500;



        System.out.println(stuName+"는 "+scoolName+"에 가기 위해서");
        System.out.println(busNo+"를 "+busMoney+"를 내고 탔다.");

        System.out.println("===========================");




    }
}
