package campus.ch07;

class Switch03 {

    public static void main(String[] args) {

        /**
         * default와 break에 대한 설명
         * 그 외 다양한 사용 방법
         */
        int num = 10;
        switch (num) {
            case 5:
                System.out.println("num은 5 입니다.");
            case 10:
                System.out.println("num은 10 입니다.");
            case 3:
                System.out.println("num은 3 입니다.");
            default:
                System.out.println("num은 5, 10, 3 이 아닙니다.");
        }

    }
}
