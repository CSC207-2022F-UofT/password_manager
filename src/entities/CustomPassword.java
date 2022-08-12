package src.entities;

import java.util.ArrayList;

public class CustomPassword extends Password {
    StrengthChecker strengthChecker = new StrengthChecker();
    public void checkStrength() {
        strengthChecker.computeStrength(passwordValue);
    }

    public Strength getStrength() {
        return strengthChecker.strength;
    }

    public ArrayList<String> getSuggestion() {
        return strengthChecker.suggestion.getSuggestions();
    }
}
