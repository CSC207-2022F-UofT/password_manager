package src.UI;

import javax.swing.*;
import java.awt.*;

public class RadioBox {
    JCheckBox radioButton;

    public RadioBox() {
    }

    public void createRadioButton(JFrame dialogBox, String labelText, Color foregroundColor) {
        radioButton = new JCheckBox(labelText);
        radioButton.setBounds(70,60,260,30);
        radioButton.setForeground(Color.white);
        if (dialogBox != null) {
            dialogBox.add(radioButton);
        }
    }
}
