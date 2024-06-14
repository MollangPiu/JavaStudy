package campus.exam.level1;

public class 이어붙인수 {

    public static void main(String[] args) {
        이어붙인수 pro = new 이어붙인수();
        int[] arr = {3, 4, 5, 2, 1};
        int result = pro.solution(arr);
        System.out.println(result);

        arr = new int[]{6, 6, 7, 8, 5};
        result = pro.solution(arr);
        System.out.println(result);
    }

    public int solution(int[] num_list) {
        int fisrtNum = 0;
        int secondNum = 0;
        for(int i =0; i < num_list.length; i++) {
            if(num_list[i]%2 ==1) {
                fisrtNum*=10;
                fisrtNum+=num_list[i];
            } else {
                secondNum*=10;
                secondNum+=num_list[i];
            }
        }
        return fisrtNum+secondNum;
    }
}
