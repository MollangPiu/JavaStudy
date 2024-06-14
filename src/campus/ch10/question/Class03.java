package campus.ch10.question;

import java.util.Scanner;

class Class03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student [] students = new Student[2];
        
        for(int i=0; i< students.length; i++) {
            students[i] = new Student();
            System.out.println("- 이름 입력 - ");
            students[i].name = sc.next();
            System.out.println("- 국어점수 입력 - ");
            students[i].korScore = sc.nextInt();
            System.out.println("- 영어점수 입력 - ");
            students[i].engScore = sc.nextInt();
            System.out.println("- 수학점수 입력 - ");
            students[i].mathScore = sc.nextInt();
        }

        for (int i =0; i < students.length; i++) {
            System.out.printf("이름: "+students[i].name+"\t");
            System.out.printf("국어점수: "+students[i].korScore+"\t");
            System.out.printf("영어점수: "+students[i].engScore+"\t");
            System.out.printf("수학점수: "+students[i].mathScore+"\t");
            System.out.printf("총합: "+(students[i].korScore+students[i].engScore+students[i].mathScore)+"\t\t");
            System.out.println("평균: "+(students[i].korScore+students[i].engScore+students[i].mathScore)/3F+students[i].mathScore);
        }

    }
}

