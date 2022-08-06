package src.entities;

public class StrengthChecker {
    Strength strength;
    Suggestion suggestion;

    StrengthChecker() {
        suggestion = new Suggestion();
    }

    public void computeStrength(String password) {
        Criteria criteria = new Criteria();
        suggestion = criteria.evaluatePassword(password);
        if (suggestion.suggestions.size() == 0) {
            strength = Strength.STRONG;
        } else {
            strength = Strength.WEAK;
        }
    }
}
