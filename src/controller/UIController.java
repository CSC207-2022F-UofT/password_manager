package src.controller;

import src.UI.DialogBox;
import src.UI.Label;

import java.awt.*;

public class UIController {
    public void createPasswordGeneratorBox() {

    }

    public void createStrengthCheckerBox() {
        DialogBox dialogBox = new DialogBox();
        dialogBox.createDialogBox("Strength Checker", 400, 360);
        Label label = new Label();
        label.createLabel(dialogBox.jframe, "Enter your password to check its strength", Color.blue);
    }
}
