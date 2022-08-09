package src.UI;

import javax.swing.*;
import java.awt.*;

public class TextArea {
    public JTextArea textArea;

    public TextArea() {
    }

    public void createTextArea(JFrame dialogBox, String textAreaText, Color foregroundColor, int x, int y, int width, int height) {
        textArea = new JTextArea(textAreaText);
        textArea.setBounds(x,y,width,height);
        textArea.setForeground(Color.BLACK);
        if (dialogBox != null) {
            dialogBox.add(textArea);
        }
    }
}
