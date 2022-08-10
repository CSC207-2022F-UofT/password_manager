package UI;

import javax.swing.*;

public class Icon {
    public ImageIcon icon;
    public void createIcon(String iconFilePath) {
        icon = new ImageIcon(this.getClass().getResource(iconFilePath));
        icon.getImage();
    }
}