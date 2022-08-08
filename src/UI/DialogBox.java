package src.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogBox implements ActionListener {
    public JFrame jframe;

    public DialogBox() {
    }

    public void createDialogBox(String boxTitle, int width, int height) {
        jframe = new JFrame("Nimbus Look and Feel");
        Color c = new Color(204, 255, 255);
        // Setting background color for JFrame
        jframe.getContentPane().setBackground(c);
        jframe.setLayout(null);
        jframe.setTitle(boxTitle);
        jframe.setSize(width, height);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}