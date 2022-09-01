package entities;

public class StrengthChecker {
    Strength strength;
    Suggestion suggestion;

    StrengthChecker() {
        suggestion = new Suggestion();
    }

    /**
     * Computes the strength and suggestions for a custom password
     * Stores strength and suggestion values into class variables
     * @param password
     */
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
