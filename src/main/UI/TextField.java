package UI;

import javax.swing.*;

public class TextField {
    JTextField textField;

    /**
     * Returns class variable textField
     * @return
     */
    public JTextField getTextField() {
        return textField;
    }

    /**
     * Creates a JTextField as per specified criteria and adds it to the dialogbox.
     * @param dialogBox
     * @param boundX
     * @param boundY
     * @param boundWidth
     * @param boundHeight
     */
    public void createTextField(JFrame dialogBox, int boundX, int boundY, int boundWidth, int boundHeight) {
        textField = new JTextField();
        textField.setBounds(boundX,boundY,boundWidth,boundHeight);
        dialogBox.add(textField);
    }
}
