package campus.pro.기초문제;

import java.util.Scanner;

public class 동물사운드선택 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        동물사운드 animal = null;
        int num = 0;
        do {

            System.out.println("번호를 선택해주세요.");
            System.out.println("1번 - 강아지 / 2번 - 개구리");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    animal = new 강아지();
                    animal.sound();
                    break;

                case 2:
                    animal = new 개구리();
                    animal.sound();
                    break;
            }

        } while(num != 0);
    }
}

abstract class 동물사운드 {
    abstract void sound(); //동물 울음소리
}

class 개구리 extends 동물사운드 {
    @Override
    void sound() {
        System.out.println("개굴 개굴");
    }
}

class 강아지 extends 동물사운드 {
    @Override
    void sound() {
        System.out.println("멍 멍");
    }
}