package UI;

import javax.swing.*;
import java.awt.*;

public class TextArea {
    public JTextArea TextArea;

    public TextArea() {
    }

    public void createTextArea(JFrame dialogBox, String TextAreaText, Color foregroundColor, int x, int y, int width, int height) {
        TextArea = new JTextArea(TextAreaText);
        TextArea.setBounds(x,y,width,height);
        TextArea.setForeground(Color.BLACK);
        if (dialogBox != null) {
            dialogBox.add(TextArea);
        }
    }
}