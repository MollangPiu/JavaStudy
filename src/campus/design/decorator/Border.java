package campus.design.decorator;

public abstract class Border extends Widget{
    protected Widget widget;

    public Border(Widget widget) {
        this.widget = widget;
    }
}
