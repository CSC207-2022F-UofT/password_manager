package src;
import UI.StrengthCheckerBox;

public class PasswordManagerApp {
    static void computePasswordStrength() {
        StrengthCheckerBox strengthCheckerBox = new StrengthCheckerBox();
        strengthCheckerBox.createStrengthCheckerBox();
    }

    public static void main(String[] args) {
        //Screen 1: Password Strength Checker
        computePasswordStrength();
    }
}
