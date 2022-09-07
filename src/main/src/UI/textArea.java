package UI;

import javax.swing.*;
import java.awt.*;

public class textArea {
    public JTextArea TextArea;

    public void createTextArea(JFrame dialogBox, String textAreaText, Color foregroundColor, int x, int y, int width, int height) {
        TextArea = new JTextArea(textAreaText);
        TextArea.setBounds(x,y,width,height);
        TextArea.setForeground(Color.BLACK);
        if (dialogBox != null) {
            dialogBox.add(TextArea);
        }
    }
}