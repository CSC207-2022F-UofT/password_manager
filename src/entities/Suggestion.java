package src.entities;

import java.util.ArrayList;

public class Suggestion {
    ArrayList<String> suggestions;

    public ArrayList<String> getSuggestions() {
        return suggestions;
    }

    Suggestion() {
        suggestions = new ArrayList<>();
    }

    public void addSuggestion(String suggestion) {
        suggestions.add(suggestion);
    }

}
