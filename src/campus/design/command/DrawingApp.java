package campus.design.command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawingApp extends JFrame {
    MacroCommand history = new MacroCommand();
    public DrawingApp(String title) {
        super(title);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        Box mainBox = new Box(BoxLayout.Y_AXIS);

        JButton undoButton = new JButton("undo");
        JButton clearButton = new JButton("clear");

        DrawCanvas canvas = new DrawCanvas(400, 400, history);


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
                history.add(command);
                command.execute();
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        undoButton.addActionListener(e -> {
            canvas.repaint();
            history.undo();
        });

        clearButton.addActionListener(e -> {
            history.clear();
            canvas.repaint();
        });
    }
}
