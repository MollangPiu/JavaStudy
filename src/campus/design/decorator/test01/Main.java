package campus.design.decorator.test01;

public class Main {

    public static void main(String[] args) {
        TextWidget textWidget = new TextWidget("Hello World");
        textWidget.show();

        new FullBorder(new SideBorder(new TextWidget("Super man"))).show();
    }
}
