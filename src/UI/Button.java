package src.UI;

import javax.swing.*;
import java.awt.*;

public class Button {
    public JButton button;

    public Button() {
    }

    public void createButton(JFrame dialogBox, String buttonText, Color foregroundColor, int x, int y, int width, int height) {
        button = new JButton(buttonText);
        button.setBounds(x,y,width,height);
        button.setForeground(Color.white);
        if (dialogBox != null) {
            dialogBox.add(button);
        }
    }
}
