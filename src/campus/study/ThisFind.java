package campus.study;

public class ThisFind {

    int num = 10;

    public ThisFind() {
        this(50);
    }

    public ThisFind(int num) {

    }



    void testNum() {
        int num = 100;

        System.out.println(this.num);   //10
        System.out.println(num);        //100

        testNum(100);


    }

    public void testNum(int num) {
        this.num = num;
    }
}
