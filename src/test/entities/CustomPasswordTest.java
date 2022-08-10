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

}