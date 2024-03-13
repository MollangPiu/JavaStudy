package campus.study;

public abstract class Memory {

    private int [] arr;
    private int index;

    public Memory(int num) {
        arr = new int[num];
        index = 0;
    }

    public void setPush(int num) {
        this.arr[index] = num;
        index++;
    }
}
