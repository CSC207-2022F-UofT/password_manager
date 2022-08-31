package entities;

public class CustomPassword extends Password {
    StrengthChecker strengthChecker = new StrengthChecker();
    /**
     * Invokes computeStrength function of strengthChecker
     * @return
     */
    public void checkStrength() {
        strengthChecker.computeStrength(passwordValue);
    }

    /**
     * Returns strength variable of strengthChecker
     * @return
     */
    public Strength getStrength() {
        return strengthChecker.strength;
    }

    /**
     * Returns suggestion variable of strengthChecker
     * @return
     */
    public String getSuggestion() {
        return strengthChecker.suggestion.getSuggestion();
    }
}
