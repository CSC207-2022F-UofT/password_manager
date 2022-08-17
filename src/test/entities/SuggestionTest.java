package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuggestionTest {
    Suggestion suggestion;

    @BeforeEach
    public void init() {
        suggestion = new Suggestion();
    }

    @Test
    @DisplayName("Suggestion - should be null by default")
    public void testSuggestionDefaultSize() {
        assertEquals(suggestion.getSuggestion(), null);
    }

    @Test
    @DisplayName("Suggestion - check get and set methods")
    public void testGetAndSetSuggestion() {
        String suggestionText = "Test Suggestion";
        suggestion.setSuggestion(suggestionText);
        assertEquals(suggestion.getSuggestion(), suggestionText);
    }

}