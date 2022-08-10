package UI;

import javax.swing.*;

public class Button {
    public JButton button;
    public void createButtonWithIcon(JFrame dialogBox, String buttonText, ImageIcon icon) {
        button = new JButton(buttonText, icon);
        button.setBounds(90,150,240,30);
        dialogBox.add(button);
    }
}