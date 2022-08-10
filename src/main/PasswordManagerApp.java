//import src.usecases.ComputePasswordStrength;

import controller.StrengthCheckerUIControl;

public class PasswordManagerApp {
    static void ComputePasswordStrength() {
        StrengthCheckerUIControl uiController = new StrengthCheckerUIControl();
        uiController.createStrengthCheckerBox();
    }

    public static void main(String[] args) {
        //Use-case 1: Password Strength Checker
        ComputePasswordStrength();
    }
}
