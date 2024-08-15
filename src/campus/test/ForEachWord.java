package campus.test;

public class ForEachWord {

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        String [] coffees = { "아메리카노", "바닐라라떼", "카라멜라떼", "복숭아 아이스티"};

        //변수명 규칙
        //단어 + 단어를 붙인다.
        //연관된 단어끼리 한다.
        //검색 + 메뉴 + 인덱스.
        for(int i =0; i < coffees.length; i++) {
            System.out.println(coffees[i]);
            if("아메리카노".
        }

        System.out.println("===========================");
        //1. 배열을 출력할 때 매우 유용.
        //2. 인덱스 구분 할 수 없다.
        //forEach: for문 + Array.
        int cnt = 0;
        for(String  li: coffees) {
            System.out.println("cnt: "+cnt+" 커피메뉴: "+li);
            if("아메리카노".equals(li)) {
                System.out.println("아메리카노 찾았다.");
            }
            cnt++;
        }
    }
}
