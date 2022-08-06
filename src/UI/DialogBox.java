package src.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogBox implements ActionListener {
    JFrame jframe;

    public DialogBox() {
        jframe = new JFrame("Nimbus Look and Feel");
        Color c = new Color(204, 255, 255);
        // Setting background color for JFrame
        jframe.getContentPane().setBackground(c);
        jframe.setLayout(null);
        jframe.setTitle("Password Generator");
        jframe.setSize(400, 360);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}