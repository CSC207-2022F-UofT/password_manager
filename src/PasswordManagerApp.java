package src;

//import src.usecases.ComputePasswordStrength;

import src.controller.StrengthCheckerUIControl;

public class PasswordManagerApp {
    static void computePasswordStrength() {
        StrengthCheckerUIControl uiController = new StrengthCheckerUIControl();
        uiController.createStrengthCheckerBox();
    }

    public static void main(String[] args) {
        //Use-case 1: Password Strength Checker
        computePasswordStrength();
    }
}
