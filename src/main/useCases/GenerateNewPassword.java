package useCases;

import entities.NewPassword;

public class GenerateNewPassword {
    NewPassword newPassword = new NewPassword();
    public void generateNewPassword(int passlen ,String choices) {
        newPassword.setPasswordLength(passlen);
        newPassword.setChoices(choices);
        newPassword.generatePassword();
    }

    public String getNewPassword() {
        return newPassword.getPassword().toString();

    }

}
