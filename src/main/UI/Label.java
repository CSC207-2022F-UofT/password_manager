package UI;

import javax.swing.*;
import java.awt.*;

public class Label {
    JLabel label;

    public JLabel getLabel() {
        return label;
    }

    /**
     * Creates a label and (optionally) adds it to an existing Dialog Box.
     * @param dialogBox
     * @param labelText
     * @param foregroundColor
     */
    public void createLabel(int boundX, int boundY, int boundWidth, int boundHeight, JFrame dialogBox, String labelText, Color foregroundColor) {
        label = new JLabel(labelText);
        label.setBounds(boundX, boundY, boundWidth, boundHeight);
        label.setForeground(foregroundColor);
        if (dialogBox != null) {
            dialogBox.add(label);
        }
    }
}
