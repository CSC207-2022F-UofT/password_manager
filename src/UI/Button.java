package src.UI;

import javax.swing.*;
import java.awt.*;

public class Button {
    public JButton button;
    public void createButtonWithIcon(JFrame dialogBox, String buttonText, ImageIcon icon, int boundX,
                                     int boundY, int boundWidth, int boundHeight) {
        button = new JButton(buttonText, icon);
        button.setBounds(boundX,boundY,boundWidth,boundHeight);
        dialogBox.add(button);
    }
}