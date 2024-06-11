package campus.ch08;

class While03 {

    /**
     * 다중 반복문
     * 증감문 모두 삭제후, 어디부분을 추가하면 해당 결과값 나올 수 있는지 확인하기
     * @param args
     */
    public static void main(String[] args) {

        int first = 0;
        int second = 0;
        int result = 0;
        while(first < 2) {

            while(second < 2) {
                System.out.println(++result);
                second++;
            }
            first++;
            second = 0;
        }
    }
}
