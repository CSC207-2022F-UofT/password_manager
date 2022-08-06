package src.entities;

public class Criteria {
    /**
     * Evaluates password against pre-defined criteria
     * If password fails a criteria, suggestion is given to improve it
     * Invoking function can check if the suggestion is empty, then password is strong
     *
     * @param password
     * @return Suggestion
     */
    public Suggestion evaluatePassword(String password) {
        Suggestion suggestion = new Suggestion();

        // Check if password contains empty spaces
        if (password.matches("(\\s)*")) {
            suggestion.addSuggestion("EMPTY SPACES");
        }
        // Check if password has whitespaces
        else if (password.matches("(.)*(\\s)+(.)*")) {
            suggestion.addSuggestion("Whitespace not allowed");
        }
        // Check if password is greater than 8 chars
        else if (password.length() < 8) {
            suggestion.addSuggestion("Add more characters");
        }
        // Check if password is lesser than 30 chars
        else if (password.length() > 30) {
            suggestion.addSuggestion("Password too long, max char is 30");
        }
        // Check if password has numbers
        else if (!password.matches("(.)*(\\d)(.)*")) {
            suggestion.addSuggestion("Add any digit");
        }
        // Check if password has symbols
        else if (!password.matches("(.)*[\\*\\!\\@\\#\\$\\%\\^\\&\\_\\-\\+\\=\\.\\'\\~\\,\\(\\)\\:\\;\\<\\>\\[\\]\\|\\}\\{\\/]+(.)*")) {
            suggestion.addSuggestion("Add a symbol");
        }
        return suggestion;
    }
}
