package controller;

import useCases.GenerateNewPassword;

public class PasswordGeneratorUIControl extends UIController {

    static String result;

    public static String getResult() {
        return result;
    }

    public static void setResult(String result) {
        PasswordGeneratorUIControl.result = result;
    }

    public static void  performPasswordGeneration(int passlen, String choices) {
        GenerateNewPassword generateNewPassword = new GenerateNewPassword();
        generateNewPassword.generateNewPassword(passlen, choices);
        setResult(generateNewPassword.getNewPassword());
    }

}
