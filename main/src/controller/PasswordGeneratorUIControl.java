package controller;

import useCases.GenerateNewPassword;

public class PasswordGeneratorUIControl extends UIController {

    String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void performPasswordGeneration(int passlen, String choices) {
        GenerateNewPassword generateNewPassword = new GenerateNewPassword();
        generateNewPassword.generateNewPassword(passlen, choices);
        setResult(generateNewPassword.getNewPassword());
    }

}
