package campus.design.observer.test04;

public class DefaultObserver implements Observer{
    private int num;

    @Override
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int getNum() {
        return this.num;
    }
}
