package useCases;

import entities.CustomPassword;

public class ComputePasswordStrength {
    CustomPassword customPassword = new CustomPassword();
    public void computeStrength(String customPasswordValue) {
        customPassword.setPassword(customPasswordValue);
        customPassword.checkStrength();
    }

    public String getStrength() {
        return customPassword.getStrength().toString();
    }

    public String getSuggestion() {
        return customPassword.getSuggestion();
    }

}
