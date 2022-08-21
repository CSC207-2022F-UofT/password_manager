package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewPasswordTest {
    NewPassword newPassword = new NewPassword();

    @BeforeEach
    public void init() {
        newPassword = new NewPassword();
    }
        @Test
        @DisplayName("Custom Password - Test Get and Set Methods")
        public void testGetAndSetPassword() {
            String testPasswordValue = "testPassword";
            assertEquals(newPassword.getPassword(), null);
            newPassword.setPassword(testPasswordValue);
            assertEquals(newPassword.getPassword(), testPasswordValue);
        }

        @Test
        @DisplayName("Custom Password - Test Get and Set Methods")
        public void testNewPasswordGeneration() {
            newPassword.setPasswordLength(10);
            newPassword.setChoices("LUS");
            newPassword.generatePassword();
            assertEquals(newPassword.getPassword().length(), 10);
        }
}