package campus.design.observer.test04;

public class TwoObserver implements Observer{
    private int num;

    @Override
    public void setNum(int num) {
        this.num = (num*2);
    }

    @Override
    public int getNum() {
        return this.num;
    }
}
