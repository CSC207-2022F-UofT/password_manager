package UI;

import javax.swing.*;

public class Icon {
    ImageIcon icon;

    /**
     * Returns class variable icon
     * @return
     */
    public ImageIcon getIcon() {
        return icon;
    }

    /**
     * Creates an ImageIcon by reading image from the provided filepath
     * @param iconFilePath
     */
    public void createIcon(String iconFilePath) {
        icon = new ImageIcon(this.getClass().getResource(iconFilePath));
        icon.getImage();
    }
}