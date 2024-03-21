package campus.sort;

public class SortExam {

    public static void main(String[] args) {

        int [] data = { 90, 78, 100, 30, 55};

        bubbleSort(data);

        for(int i : data) {
            System.out.print(i+" , ");
        }
    }

    public static void bubbleSort(int [] data) {
        int changeCnt = 0;
        int innerFor = 0;
        for(int i = 0; i < data.length-1; i++) {
            for(int j = 0; j < data.length-i-1; j++) {
                if(data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                    changeCnt++;
                }
            innerFor++;
            }

        }

        System.out.println("반복횟수: "+changeCnt);
        System.out.println("반복횟수: "+innerFor);
    }
}
