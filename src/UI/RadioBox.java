package src.UI;

import javax.swing.*;
import java.awt.*;

public class RadioBox {
    JCheckBox radioButton;

    public RadioBox() {
    }

    public void createRadioButton(JFrame dialogBox, String labelText, Color foregroundColor, int x, int y, int width, int height) {
        radioButton = new JCheckBox(labelText);
        radioButton.setBounds(x,y,width,height);
        radioButton.setForeground(Color.white);
        if (dialogBox != null) {
            dialogBox.add(radioButton);
        }
    }
}
