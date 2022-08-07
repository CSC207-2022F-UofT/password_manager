package src.UI;

import javax.swing.*;
import java.awt.*;

public class ComboBox {
    JComboBox<String> comboBox;

    public ComboBox() {
    }

    public void createComboBox(JFrame dialogBox, String[] comboBoxItems, Color foregroundColor) {
        comboBox = new JComboBox(comboBoxItems);
        comboBox.setBounds(70,60,260,30);
        comboBox.setForeground(Color.white);
        if (dialogBox != null) {
            dialogBox.add(comboBox);
        }
    }
}
