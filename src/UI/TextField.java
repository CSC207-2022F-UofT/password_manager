package src.UI;

import javax.swing.*;

public class TextField {
    public JTextField textField;

    public TextField() {
    }

    public void createTextField(JFrame dialogBox, int boundX, int boundY, int boundWidth, int boundHeight) {
        textField = new JTextField();
        textField.setBounds(boundX,boundY,boundWidth,boundHeight);
        dialogBox.add(textField);
    }
}
