package UI;

import javax.swing.*;

public class textField {
    private JTextField textField;

    public JTextField getTextField() {
        return textField;
    }

    public void createTextField(JFrame dialogBox, int boundX, int boundY, int boundWidth, int boundHeight) {
        textField = new JTextField();
        textField.setBounds(boundX,boundY,boundWidth,boundHeight);
        dialogBox.add(textField);
    }
}
