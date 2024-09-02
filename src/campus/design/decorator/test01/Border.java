package campus.design.decorator.test01;

public abstract class Border extends Widget{
    protected Widget widget;

    public Border(Widget widget) {
        this.widget = widget;
    }
}
