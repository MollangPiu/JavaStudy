package campus.design.decorator.test;

class Main {

    public static void main(String[] args) {

        TextWidget textWidget = new TextWidget("hello");
        textWidget.show();

        new FullBorder(new SideBorder(new FullBorder(new SideBorder(new TextWidget("hello World"))))).show();
    }
}
