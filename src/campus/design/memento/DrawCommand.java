package campus.design.memento;

import java.awt.*;

public class DrawCommand implements Command, Cloneable {

    private Drawble drawble;
    private Point point;

    public DrawCommand(Drawble drawble, Point point) {
        this.drawble = drawble;
        this.point = point;
    }

    @Override
    public void execute() {
        drawble.draw(point.x, point.y);
    }
}
