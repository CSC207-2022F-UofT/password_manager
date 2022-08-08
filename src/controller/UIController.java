package src.controller;

import src.UI.Button;
import src.UI.DialogBox;
import src.UI.Icon;
import src.UI.Label;
import src.UI.TextField;

import java.awt.*;

public class UIController {
    public void createPasswordGeneratorBox() {

    }

    public void createStrengthCheckerBox() {
        DialogBox dialogBox = new DialogBox();
        dialogBox.createDialogBox("Strength Checker", 400, 360);
        Label label = new Label();
        label.createLabel(dialogBox.jframe, "Enter your password to check its strength", Color.blue);
        TextField passwordTextField = new TextField();
        passwordTextField.createTextField(dialogBox.jframe);
        Icon icon = new Icon();
        icon.createIcon("../resources/icons/password.png");
        Button checkPasswordButton = new Button();
        checkPasswordButton.createButtonWithIcon(dialogBox.jframe, "How strong is your password?", icon.icon);
    }
}