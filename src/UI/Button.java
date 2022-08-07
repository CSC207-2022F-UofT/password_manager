package src.UI;

import javax.swing.*;
import java.awt.*;

public class Button {
    JButton button;

    public Button() {
    }

    public void createButton(JFrame dialogBox, String buttonText, Color foregroundColor) {
        button = new JButton(buttonText);
        button.setBounds(70,60,260,30);
        button.setForeground(Color.white);
        if (dialogBox != null) {
            dialogBox.add(button);
        }
    }
}
