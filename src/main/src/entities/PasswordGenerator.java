package entities;

public class PasswordGenerator {


    public String generateLCLetters(int len) {
        StringBuilder lowerCaseLetters = new StringBuilder();
        for (int i = 1; i <= len; i++) {
            double d = (Math.random() * (122 - 97)) + 97;       // ASCII values between 97 to 122
            int num = (int) d;
            String s = Character.toString((char) num);
            lowerCaseLetters.append(s);
        }
        return lowerCaseLetters.toString();
    }

    // Function to generate only uppercase letters of length specified in argument
    public String generateUCLetters(int len) {
        StringBuilder upperCaseLetters = new StringBuilder();
        for (int i = 1; i <= len; i++) {
            double d = (Math.random() * (91 - 65)) + 65;      // ASCII values between 65 to 91
            int num = (int) d;
            String s = Character.toString((char) num);
            upperCaseLetters.append(s);
        }
        return upperCaseLetters.toString();
    }

    // Function to generate only digits of length specified in argument
    public String generateNumbers(int len) {
        StringBuilder numberLetters = new StringBuilder();
        for (int i = 1; i <= len; i++) {
            double d = (Math.random() * (57 - 48)) + 48;      // ASCII values between 48 to 57
            int num = (int) d;
            String s = Character.toString((char) num);
            numberLetters.append(s);
        }
        return numberLetters.toString();
    }

    // Function to generate only symbols of length specified in argument
    public String generateSymbols(int len) {
        StringBuilder symbolLetters = new StringBuilder();
        for (int i = 1; i <= len; i++) {
            double choice = (Math.random() * (5 - 1)) + 1;      // Random numbers between 1 and 4
            int choicenum = (int) choice;
            String symbolchoice = "";
            double d = 0;
            switch (choicenum) {
                case 1 -> d = (Math.random() * (47 - 33)) + 33;       // ASCII values between 33 to 47
                case 2 -> d = (Math.random() * (64 - 58)) + 58;       // ASCII values between 58 to 64
                case 3 -> d = (Math.random() * (95 - 91)) + 91;       // ASCII values between 91 to 95
                case 4 -> d = (Math.random() * (126 - 123)) + 123;    // ASCII values between 123 to 126
                default -> { d = 45;
                }
            }
            int num = (int) d;
            String s = Character.toString((char) num);
            symbolLetters.append(s);
        }
        return symbolLetters.toString();
    }

}