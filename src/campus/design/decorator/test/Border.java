package campus.design.decorator.test;

public abstract class Border extends Widget {
    protected Widget widget;

    public Border(Widget widget) {
        this.widget = widget;
    }
}
