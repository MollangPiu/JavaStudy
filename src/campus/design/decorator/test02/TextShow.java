package campus.design.decorator.test02;

public class TextShow extends Show{
    String text;

    public TextShow(String text) {
        this.text = text;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        return row == 0 ? text : null;
    }
}
