package controller;
import useCases.ComputePasswordStrength;

public class StrengthCheckerUIControl {
    String result;
    String suggestion;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public void performStrengthCheck(String customPasswordValue) {
        ComputePasswordStrength computePasswordStrength = new ComputePasswordStrength();
        computePasswordStrength.computeStrength(customPasswordValue);
        setResult(computePasswordStrength.getStrength());
        setSuggestion(computePasswordStrength.getSuggestion());
    }
}
