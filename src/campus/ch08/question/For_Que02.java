package campus.ch08.question;

class For_Que02 {

    /**
     * 구구단 2
     * 1, 3, 5, 7, 9단만 표현하기 만들 수 있다.
     * @param args
     */
    public static void main(String[] args) {


        for(int first=1; first<=9; first++) {
            for(int second = 1; second <= 9; second++) {
                System.out.printf(second+" x "+first+" = "+(first*second)+"\t\t");
            }
            System.out.println();
        }


    }
}
