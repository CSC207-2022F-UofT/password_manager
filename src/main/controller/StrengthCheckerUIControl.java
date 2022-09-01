package controller;
import use_cases.ComputePasswordStrength;

public class StrengthCheckerUIControl {
    String result;
    String suggestion;

    /**
     * Returns class variable result
     * @return
     */
    public String getResult() {
        return result;
    }

    private void setResult(String result) {
        this.result = result;
    }

    /**
     * Returns class variable suggestion
     * @return
     */
    public String getSuggestion() {
        return suggestion;
    }

    private void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    /**
     * Computes Strength and Suggestion for customPassword
     * Invokes computeStrength function of customPassword object
     * @param customPasswordValue
     */
    public void performStrengthCheck(String customPasswordValue) {
        ComputePasswordStrength computePasswordStrength = new ComputePasswordStrength();
        computePasswordStrength.computeStrength(customPasswordValue);
        setResult(computePasswordStrength.getStrength());
        setSuggestion(computePasswordStrength.getSuggestion());
    }
}
