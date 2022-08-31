package UI;

import javax.swing.*;
import java.awt.*;

public class DialogBox {
    JFrame jframe;

    /**
     * Returns class variable jframe
     * @return
     */
    public JFrame getJframe() {
        return jframe;
    }

    /**
     * Creates a JFrame UI component as per the specs provided
     * @param boxTitle
     * @param width
     * @param height
     */
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
}