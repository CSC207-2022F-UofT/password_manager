package src.controller;

import src.UI.Button;
import src.UI.DialogBox;
import src.UI.Icon;
import src.UI.Label;
import src.UI.TextField;
import src.useCases.ComputePasswordStrength;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class StrengthCheckerUIControl extends UIController {
    DialogBox dialogBox;
    Label inputLabel, resultLabel, suggestionLabel;
    TextField passwordTextField;
    Icon icon;
    Button checkPasswordButton;
    String customPasswordValue;

    public void createStrengthCheckerBox() {
        dialogBox = new DialogBox();
        dialogBox.createDialogBox("Strength Checker", 400, 360);
        inputLabel = new Label();
        inputLabel.createLabel(70, 60, 260, 30, dialogBox.getJframe(), "Enter your password to check its strength", Color.blue);
        passwordTextField = new TextField();
        passwordTextField.createTextField(dialogBox.getJframe(),100,100,200,30);
        icon = new Icon();
        icon.createIcon("../resources/icons/password.png");
        checkPasswordButton = new Button();
        checkPasswordButton.createButtonWithIcon(dialogBox.getJframe(), "How strong is your password?", icon.getIcon(), 90,150,240,30);
        checkPasswordButton.getButton().addActionListener(this);
    }

    public void invokeStrengthCheckerUseCase() {
        ComputePasswordStrength computePasswordStrength = new ComputePasswordStrength();
        computePasswordStrength.computeStrength(customPasswordValue);
        setResult(computePasswordStrength.getStrength());
        setSuggestion(computePasswordStrength.getSuggestion());
    }

    public void setResult(String resultText) {
        resultLabel = new Label();
        resultLabel.createLabel(170, 200, 150, 30, dialogBox.getJframe(), "", Color.red);
        resultLabel.getLabel().setText(resultText);
    }

    public void setSuggestion(ArrayList<String> suggestions) {
        // Picking only the first suggestion
        String suggestion = suggestions.get(0);
        suggestionLabel = new Label();
        suggestionLabel.createLabel(130, 230, 150, 30, dialogBox.getJframe(), "", Color.red);
        suggestionLabel.getLabel().setText(suggestion);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        customPasswordValue = passwordTextField.getTextField().getText();
        invokeStrengthCheckerUseCase();
    }
}
