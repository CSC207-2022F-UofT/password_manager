package src.classes;

import java.util.ArrayList;

public class Suggestion {
    ArrayList<String> suggestions;

    Suggestion() {
        suggestions = new ArrayList<>();
    }

    public void addSuggestion(String suggestion) {
        suggestions.add(suggestion);
    }

}
