package campus.design.decorator.test02;

public abstract class Show {

    //행의 길이
    public abstract int getRows();

    public abstract String getRowText(int row);

    public void show() {
        for(int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
