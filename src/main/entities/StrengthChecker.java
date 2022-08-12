package entities;

public class StrengthChecker {
    Strength strength;
    Suggestion suggestion;

    StrengthChecker() {
        suggestion = new Suggestion();
    }

    public void computeStrength(String password) {
        Criteria criteria = new Criteria();
        suggestion = criteria.evaluatePassword(password);
        if (suggestion.suggestion == null) {
            strength = Strength.STRONG;
        } else {
            strength = Strength.WEAK;
        }
    }
}
