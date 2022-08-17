package UI;

import javax.swing.*;

public class Button {
    JButton button;

    public JButton getButton() {
        return button;
    }

    public void createButtonWithIcon(JFrame dialogBox, String buttonText, ImageIcon icon, int boundX,
                                     int boundY, int boundWidth, int boundHeight) {
        button = new JButton(buttonText, icon);
        button.setBounds(boundX,boundY,boundWidth,boundHeight);
        dialogBox.add(button);
    }
}