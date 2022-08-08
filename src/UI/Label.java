package src.UI;

import javax.swing.*;
import java.awt.*;

public class Label {
    JLabel label;

    public Label() {
    }

    /**
     * Creates a label and (optionally) adds it to an existing Dialog Box.
     * @param dialogBox
     * @param labelText
     * @param foregroundColor
     */
    public void createLabel(JFrame dialogBox, String labelText, Color foregroundColor, int x, int y, int width, int height) {
        label = new JLabel(labelText);
        label.setBounds(x,y,width,height);
        label.setForeground(foregroundColor);
        if (dialogBox != null) {
            dialogBox.add(label);
        }
    }
}
