package src.usecases;

import src.entities.CustomPassword;

import java.util.ArrayList;

public class ComputePasswordStrength {
    CustomPassword customPassword = new CustomPassword();
    public void computeStrength(String customPasswordValue) {
        customPassword.setPassword(customPasswordValue);
        customPassword.checkStrength();
        customPassword.getSuggestion();
    }

    public String getStrength() {
        return customPassword.getStrength().toString();
    }

    public ArrayList<String> getSuggestion() {
        return customPassword.getSuggestion().suggestions;
    }

}
