package campus.pro.반복문.question;

class While_Que03 {

    /**
     * 구구단
     * @param args
     */
    public static void main(String[] args) {


        int first = 1;
        while(first <= 9) {
            int second = 1;
            while(second <= 9) {
                System.out.printf(second+" x "+first+" = "+(first*second)+"\t\t");
                second++;
            }
            System.out.println();
            first++;
        }
    }
}
