package entities;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomPasswordTest {
    CustomPassword customPassword;

    @BeforeEach
    public void init() {
        customPassword = new CustomPassword();
    }

    @Test
    @DisplayName("Custom Password - Test Get and Set Methods")
    public void testGetAndSetPassword() {
        String testPasswordValue = "testPassword";
        assertEquals(customPassword.getPassword(), null);
        customPassword.setPassword(testPasswordValue);
        assertEquals(customPassword.getPassword(), testPasswordValue);
    }

    @Test
    @DisplayName("Custom Password - Test default Strength and Suggestion")
    public void testDefaultStrengthAndSuggestion() {
        Strength strength = customPassword.getStrength();
        String suggestion = customPassword.getSuggestion();
        assertEquals(strength, null);
        assertEquals(suggestion, null);
    }

    @Test
    @DisplayName("Custom Password - Test Compute Strength Method")
    public void testComputeStrength() {
        String strongPasswordText = "Abcd@1234";
        customPassword.setPassword(strongPasswordText);
        customPassword.checkStrength();
        assertEquals(customPassword.getStrength(), Strength.STRONG);
        assertEquals(customPassword.getSuggestion(), null);
    }

}