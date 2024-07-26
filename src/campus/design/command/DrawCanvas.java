package campus.design.command;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawble{
    private int radius = 5;
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.WHITE);
        this.history = history;
    }
    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(Color.RED);
        g.fillOval(x-radius, y-radius, radius*2, radius*2);
    }

    @Override
    public void paint(Graphics g) {
        history.execute();
    }
}
