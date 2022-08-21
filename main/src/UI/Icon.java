package UI;

import javax.swing.*;
import java.util.Objects;

public class Icon {
    ImageIcon icon;

    public ImageIcon getIcon() {
        return icon;
    }

    public void createIcon(String iconFilePath) {
        icon = new ImageIcon(Objects.requireNonNull(this.getClass().getResource(iconFilePath)));
        icon.getImage();
    }
}