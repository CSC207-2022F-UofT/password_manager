package src;
import UI.PasswordGeneratorBox;
import UI.StrengthCheckerBox;

public class PasswordManagerApp {
    static void computePasswordStrength() {
        StrengthCheckerBox strengthCheckerBox = new StrengthCheckerBox();
        strengthCheckerBox.createStrengthCheckerBox();
    }

    static void generateNewPassword() {
        PasswordGeneratorBox passwordGeneratorBox = new PasswordGeneratorBox();
        passwordGeneratorBox.createPasswordGeneratorBox();
    }

    public static void main(String[] args) {
        //Screen 1: Password Strength Checker
        computePasswordStrength();
        //Screen 2: Password Generator
        generateNewPassword();
    }
}
