package UI;

import javax.swing.*;
import java.awt.*;

public class ComboBox {
    JComboBox comboBox;

    public ComboBox() {
    }

    public JComboBox getComboBox() {
        return comboBox;
    }

    public void createComboBox(JFrame dialogBox, String[] comboBoxItems, Color foregroundcolor, int boundX, int boundY, int boundWidth, int boundHeight) {
        comboBox = new JComboBox(comboBoxItems);
        comboBox.setBounds(boundX,boundY,boundWidth,boundHeight);
        comboBox.setForeground(foregroundcolor);
        if (dialogBox != null) {
            dialogBox.add(comboBox);
        }
    }
}
