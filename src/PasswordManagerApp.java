package src;

//import src.usecases.ComputePasswordStrength;

import src.controller.UIController;

public class PasswordManagerApp {
    static void ComputePasswordStrength() {
        UIController uiController = new UIController();
        uiController.createStrengthCheckerBox();
    }

    public static void main(String[] args) {
        //Use-case 1: Password Strength Checker
        ComputePasswordStrength();
    }
}
