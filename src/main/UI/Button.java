package UI;

import javax.swing.*;

public class Button {
    JButton button;

    /**
     * Returns class variable button
     * @return
     */
    public JButton getButton() {
        return button;
    }

    /**
     * Creates a JButton UI component with an image icon
     * @param dialogBox
     * @param buttonText
     * @param icon
     * @param boundX
     * @param boundY
     * @param boundWidth
     * @param boundHeight
     */
    public void createButtonWithIcon(JFrame dialogBox, String buttonText, ImageIcon icon, int boundX,
                                     int boundY, int boundWidth, int boundHeight) {
        button = new JButton(buttonText, icon);
        button.setBounds(boundX,boundY,boundWidth,boundHeight);
        dialogBox.add(button);
    }
}