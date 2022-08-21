package UI;

import controller.StrengthCheckerUIControl;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StrengthCheckerBox implements ActionListener {
    DialogBox dialogBox;
    Label inputLabel, resultLabel, suggestionLabel;
    textField passwordTextField;
    Icon icon;
    Button checkPasswordButton;
    String customPasswordValue;

    public void createStrengthCheckerBox() {
        dialogBox = new DialogBox();
        dialogBox.createDialogBox("Strength Checker", 400, 360);
        inputLabel = new Label();
        inputLabel.createLabel(70, 60, 260, 30, dialogBox.getJframe(), "Enter your password to check its strength", Color.blue);
        passwordTextField = new textField();
        passwordTextField.createTextField(dialogBox.getJframe(),100,100,200,30);
        icon = new Icon();
        icon.createIcon("../resources/icons/password.png");
        checkPasswordButton = new Button();
        checkPasswordButton.createButtonWithIcon(dialogBox.getJframe(), "How strong is your password?", icon.getIcon(), 90,150,240,30);
        checkPasswordButton.getButton().addActionListener(this);
    }

    public void setResult(String resultText) {
        resultLabel = new Label();
        resultLabel.createLabel(170, 200, 150, 30, dialogBox.getJframe(), "", Color.red);
        resultLabel.getLabel().setText(resultText);
    }

    public void setSuggestion(String suggestion) {
        suggestionLabel = new Label();
        suggestionLabel.createLabel(130, 230, 150, 30, dialogBox.getJframe(), "", Color.red);
        suggestionLabel.getLabel().setText(suggestion);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        customPasswordValue = passwordTextField.getTextField().getText();
        StrengthCheckerUIControl strengthCheckerUIControl = new StrengthCheckerUIControl();
        strengthCheckerUIControl.performStrengthCheck(customPasswordValue);
        setResult(strengthCheckerUIControl.getResult());
        setSuggestion(strengthCheckerUIControl.getSuggestion());
    }
}
