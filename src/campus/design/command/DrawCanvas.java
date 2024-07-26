package campus.design.command;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawble{
    private int radius = 5;

    public DrawCanvas(int width, int height) {
        setSize(width, height);
        setBackground(Color.WHITE);
    }
    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(Color.RED);
        g.fillOval(x-radius, y-radius, radius*2, radius*2);
    }
}
