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
    @DisplayName("Suggestion - should be empty by default")
    public void testSuggestionDefaultSize() {
        assertEquals(suggestion.suggestions.size(), 0);
    }

}