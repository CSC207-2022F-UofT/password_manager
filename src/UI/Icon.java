package src.UI;

import javax.swing.*;
import java.awt.*;

public class Icon {
    public ImageIcon icon;
    public void createIcon(String iconFilePath) {
        icon = new ImageIcon(this.getClass().getResource("/icons/password.png"));
        icon.getImage();
    }
}