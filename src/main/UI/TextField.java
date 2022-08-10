package UI;

import javax.swing.*;

public class TextField {
    public JTextField textField;

    public TextField() {
    }

    public void createTextField(JFrame dialogBox) {
        textField = new JTextField();
        textField.setBounds(100,100,200,30);
        dialogBox.add(textField);
    }
}
