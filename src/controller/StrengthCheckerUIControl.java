package src.controller;

import src.UI.Button;
import src.UI.Label;
import src.UI.TextField;
import src.UI.*;
import src.usecases.ComputePasswordStrength;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class StrengthCheckerUIControl extends PasswordGeneratorUIController {
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
        inputLabel.createLabel(70, 60, 260, 30, dialogBox.jframe, "Enter your password to check its strength", Color.blue);
        passwordTextField = new TextField();
        passwordTextField.createTextField(dialogBox.jframe);
        icon = new Icon();
        icon.createIcon("../resources/icons/password.png");
        checkPasswordButton = new Button();
        checkPasswordButton.createButtonWithIcon(dialogBox.jframe, "How strong is your password?", 130, 195, 100, 30, icon.icon);
        checkPasswordButton.button.addActionListener(this);
    }

    public void invokeStrengthCheckerUseCase() {
        ComputePasswordStrength computePasswordStrength = new ComputePasswordStrength();
        computePasswordStrength.computeStrength(customPasswordValue);
        setResult(computePasswordStrength.getStrength());
        setSuggestion(computePasswordStrength.getSuggestion());
    }

    public void setResult(String resultText) {
        resultLabel = new Label();
        resultLabel.createLabel(170, 200, 150, 30, dialogBox.jframe, "", Color.red);
        resultLabel.label.setText(resultText);
    }

    public void setSuggestion(ArrayList<String> suggestions) {
        // Picking only the first suggestion
        String suggestion = suggestions.get(0);
        suggestionLabel = new Label();
        suggestionLabel.createLabel(130, 230, 150, 30, dialogBox.jframe, "", Color.red);
        suggestionLabel.label.setText(suggestion);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        customPasswordValue = passwordTextField.textField.getText();
        invokeStrengthCheckerUseCase();
    }
}
