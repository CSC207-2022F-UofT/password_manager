package src.UI;

import javax.swing.*;
import java.awt.*;

public class ComboBox {
    JComboBox comboBox;

    public ComboBox() {
    }

    public void createComboBox(JFrame dialogBox, String[] comboBoxItems, Color foregroundColor, int x, int y, int width, int height) {
        comboBox = new JComboBox(comboBoxItems);
        comboBox.setBounds(x,y,width,height);
        comboBox.setForeground(Color.white);
        if (dialogBox != null) {
            dialogBox.add(comboBox);
        }
    }
}
