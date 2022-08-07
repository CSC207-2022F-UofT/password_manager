package src.UI;

import javax.swing.*;
import java.awt.*;

public class Label {
    JLabel label;

    /**
     * Creates a label and (optionally) adds it to an existing Dialog Box.
     * @param dialogBox
     * @param labelText
     * @param foregroundColor
     */
    public void createLabel(JFrame dialogBox, String labelText, Color foregroundColor) {
        label = new JLabel(labelText);
        label.setBounds(70,60,260,30);
        label.setForeground(foregroundColor);
        if (dialogBox != null) {
            dialogBox.add(label);
        }
    }
}
