package swing;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui implements ActionListener{
    int count = 0;
    Label label;
    JFrame frame;
    JPanel panel;
    Button button;

    Gui() {
        frame = new JFrame();
        button = new Button("Click me");
        button.addActionListener(this);
        label = new Label("no of clicks: 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 30));
        panel.setLayout(new GridLayout(2,3));
        panel.add(button);
        panel.add(label);

        frame.setPreferredSize(new Dimension(400,300));
        frame.add(panel, BorderLayout.CENTER);
        frame.setTitle("hello world");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Gui();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("no of clicks: " + count);
    }
}
