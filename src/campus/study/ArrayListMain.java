package campus.study;

import java.util.Scanner;

abstract class Mem {
    protected int[] arr = new int[5];
    protected int index = 0;

    public void push(int num) {
        this.arr[index] = num;
        index = index + 1;
    }

    abstract int pop();

    public void parenPring() {
        System.out.println("parentPrint 자식");
    }
}

class MySta extends Mem {

    @Override
    int pop() {
        return arr[--index];
    }

    @Override
    public void parenPring() {
        System.out.println("parentPrint 자식");
        disp();
    }

    public void disp() {
        System.out.println("123");
    }
}

class Myque extends Mem {

    @Override
    int pop() {
        int num = arr[0];
        for(int i=1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        return num;
    }
}

public class ArrayListMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Mem myLi = new MySta();


        myLi.parenPring();

        System.out.println("1. stack / 2. queue");
        int check = scanner.nextInt();
        if(check ==2 ) {
            myLi = new Myque();
        }


        while (true) {

            System.out.println("1. 입력 / 2: 출력(삭제)");
            int switchNum = scanner.nextInt();

            switch (switchNum) {
                //입력
                case 1:
                    System.out.println("넣을 숫자는 무엇인가요? ");
                    int inputNum = scanner.nextInt();
                    myLi.push(inputNum);
                    break;
                //출력
                case 2:
                    System.out.println("출력결과: "+myLi.pop());
                    break;
            }
        }

    }
}
