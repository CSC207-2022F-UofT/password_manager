package entities;

public class CustomPassword extends Password {
    StrengthChecker strengthChecker = new StrengthChecker();
    public void checkStrength() {
        strengthChecker.computeStrength(passwordValue);
    }

    public Strength getStrength() {
        return strengthChecker.strength;
    }

    public String getSuggestion() {
        return strengthChecker.suggestion.getSuggestion();
    }
}
