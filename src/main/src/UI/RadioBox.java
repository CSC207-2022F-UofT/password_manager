package UI;

import javax.swing.*;
import java.awt.*;

public class RadioBox {
    JCheckBox radioButton;

    public JCheckBox getRadioButton() {
        return radioButton;
    }

    public void createRadioButton(JFrame dialogBox, String radioButtonText, Color foregroundcolor, int boundX, int boundY, int boundWidth, int boundHeight) {
        radioButton = new JCheckBox(radioButtonText);
        radioButton.setBounds(boundX,boundY,boundWidth,boundHeight);
        radioButton.setForeground(foregroundcolor);
        if (dialogBox != null) {
            dialogBox.add(radioButton);
        }
    }

    public boolean isSelected() {
        return radioButton.isSelected();
    }

}
