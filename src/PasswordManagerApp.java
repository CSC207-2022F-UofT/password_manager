package src;

//import src.usecases.ComputePasswordStrength;

import src.controller.PasswordGeneratorUIController;
import src.controller.StrengthCheckerUIControl;

public class PasswordManagerApp {
    static void ComputePasswordStrength() {
        StrengthCheckerUIControl uiController = new StrengthCheckerUIControl();
        uiController.createStrengthCheckerBox();
    }

    static void GenerateNewPassword() {
        PasswordGeneratorUIController PasswordGenerator = new PasswordGeneratorUIController();
        PasswordGenerator.createPasswordGeneratorBox();
    }

    public static void main(String[] args) {
        //Use-case 1: Password Strength Checker
        ComputePasswordStrength();
        //Use-case 2: Password Generator
        GenerateNewPassword();
    }
}
