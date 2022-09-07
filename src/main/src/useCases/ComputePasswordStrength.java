package useCases;

import entities.CustomPassword;

public class ComputePasswordStrength {
    CustomPassword customPassword = new CustomPassword();

    /**
     * Computes strength of the custom password string
     * Invokes checkStrength function of CustomPassword object
     * @param customPasswordValue
     */
    public void computeStrength(String customPasswordValue) {
        customPassword.setPassword(customPasswordValue);
        customPassword.checkStrength();
    }

    /**
     * Returns Strength value stored by CustomPassword object
     * @return Strength
     */
    public String getStrength() {
        return customPassword.getStrength().toString();
    }

    /**
     * Returns Suggestion value stored by CustomPassword object
     * @return Suggestion
     */
    public String getSuggestion() {
        return customPassword.getSuggestion();
    }

}
