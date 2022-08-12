package UI;

import javax.swing.*;

public class Icon {
    ImageIcon icon;

    public ImageIcon getIcon() {
        return icon;
    }

    public void createIcon(String iconFilePath) {
        icon = new ImageIcon(this.getClass().getResource(iconFilePath));
        icon.getImage();
    }
}