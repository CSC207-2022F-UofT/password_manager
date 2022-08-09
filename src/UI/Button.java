package src.UI;

import javax.swing.*;

public class Button {
    public JButton button;
    public void createButtonWithIcon(JFrame dialogBox, String buttonText, int boundX, int boundY, int boundWidth, int boundHeight, ImageIcon icon) {
        button = new JButton(buttonText, icon);
        button.setBounds(boundX, boundY, boundWidth, boundHeight);
        dialogBox.add(button);
    }
}