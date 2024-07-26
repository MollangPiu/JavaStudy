package campus.design.command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class DrawingApp extends JFrame {
    public DrawingApp(String title) {
        super(title);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        Box mainBox = new Box(BoxLayout.Y_AXIS);

        JButton undoButton = new JButton("undo");
        JButton clearButton = new JButton("clear");

        DrawCanvas canvas = new DrawCanvas(400, 400);


        buttonBox.add(undoButton);
        buttonBox.add(clearButton);


        mainBox.add(buttonBox);
        mainBox.add(canvas);

        getContentPane().add(mainBox);

        pack();
        setVisible(true);

        //마우스 드레그 할때마다 포인트를 가져온다.
        canvas.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                DrawCommand command = new DrawCommand(canvas, e.getPoint());
                command.execute();
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
    }
}
