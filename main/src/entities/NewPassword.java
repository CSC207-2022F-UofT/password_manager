package entities;

public class NewPassword extends Password {

    private int passwordLength;
    private String choices;

    private PasswordGenerator passwordGenerator = new PasswordGenerator();

    //Defining constants L, U, N, S for lowercase, uppercase, number, special characters
    private final String L = "L";
    private final String U = "U";
    private final String N = "N";
    private final String S = "S";
    

    public void setPasswordLength(int passwordLength) {
        this.passwordLength = passwordLength;
    }

    public void setChoices(String choices) {
        this.choices = choices;
    }

    public void generatePassword() {

        if (choices.length() == 4) {
            setPassword(fourChoices(passwordLength));
        } else if (choices.length() == 3) {
            setPassword(threeChoices(choices, passwordLength));
        } else if (choices.length() == 2) {
            setPassword(twoChoices(choices, passwordLength));
        } else if (choices == L) {
            setPassword(passwordGenerator.generateLCLetters(passwordLength));
        } else if (choices == U) {
            setPassword(passwordGenerator.generateUCLetters(passwordLength));
        } else if (choices == N) {
            setPassword(passwordGenerator.generateNumbers(passwordLength));
        } else if (choices == S) {
            setPassword(passwordGenerator.generateSymbols(passwordLength));
        }
    }

    // When all checkboxes are selected
    public String fourChoices(int len) {
        String password = "";
        for (int i = 0; i < len; i++) {
            double d = (Math.random() * (5 - 1)) + 1;     // Random numbers between 1 and 4
            int num = (int) d;
            String choice = "";
            password = getString(password, num, choice);
        }
        return password;
    }

    // Generating password with other Criteria:
    private String getString(String password, int num, String choice) {

        switch (num) {
            case 1 -> choice = passwordGenerator.generateLCLetters(1);
            case 2 -> choice = passwordGenerator.generateUCLetters(1);
            case 3 -> choice = passwordGenerator.generateSymbols(1);
            case 4 -> choice = passwordGenerator.generateNumbers(1);
        }
        password += choice;
        return password;
    }

    /**
     * @author: Rutvik Solanki
     *
     *     When only Two/Three Choices are selected, the password starts with empty string, and iteratively one charachter is added to the string.
     *     The charachter is randomly genertaed using the math.random() function.
     *     The curernt method works in the following way:
     *     To maximize the randomness, each time a binary variable is used to track what charachter needs to be added from the two choices.
     *     If Binary variable is 0, then the charachter is added from the first choice. If Binary variable is 1, then the charachter is added from the second choice.
     *     A final number is generated between 1 and 4. This number is used to determine which choice to add the charachter from.
     *     The formula for the final number is made such that it correlated to four(All) possible choices of 2 from 4.
     *     This number when passed to the getString() function, will generate and return an appropriate charachter.
     *     The final password is returned.
     *
     *
     *
     * @param code the Code for the Choices Selected, Eg: L, LU,N, LUNS
     * @param len The password length provided by the user
     * @return password The final password generated using the getString method
     */

    // When only Two Choices are selected
    public String twoChoices(String code, int len){
        String password = "";
        // Making Password one Character at a time
        for(int i=0;i<len;i++){
            double binar = (Math.random()*(2))+0;     // Random number will be either 1 or 0
            double one = (Math.random()*(2-1))+1;       // Random number 1
            double two = (Math.random()*(3-2))+2;       // Random number 2
            double three = (Math.random()*(4-3))+3;     // Random number 3
            double four = (Math.random()*(5-4))+4;      // Random number 4
            double finalans = switch (code) {
                // When lowercase letters checkbox & symbols checkbox are selected
                // if Binar variable is 0, then lowercase letters will be generated; if Binar variable is 1, then symbols will be generated
                case "LS", "SL" -> (int) binar == 0 ? one : three;
                // When lowercase letters checkbox & numbers checkbox are selected
                // if Binar variable is 0, then lowercase letters will be generated; if Binar variable is 1, then numbers will be generated
                case "LN", "NL" -> (int) binar == 0 ? one : four;
                // When lowercase letters checkbox & uppercase letters' checkbox are selected
                // if Binar variable is 0, then lowercase letters will be generated; if Binar variable is 1, then uppercase letters will be generated
                case "LU", "UL" -> (int) binar == 0 ? one : two;
                // When uppercase letters checkbox & numbers checkbox are selected
                // if Binar variable is 0, then uppercase letters will be generated; if Binar variable is 1, then numbers will be generated
                case "UN", "NU" -> (int) binar == 0 ? two : four;
                // When symbols checkbox & uppercase letters' checkbox are selected
                // if Binar variable is 0, then symbols will be generated; if Binar variable is 1, then uppercase letters will be generated
                case "SU", "US" -> (int) binar == 0 ? three : two;
                // When numbers checkbox & symbols checkbox are selected
                // if Binar variable is 0, then numbers will be generated; if Binar variable is 1, then symbols will be generated
                case "NS", "SN" -> (int) binar == 0 ? four : three;
                default -> 0;
            };
            // get the magic code in the switch statement above; Typecast it to int and assign it to the num variable
            int num = (int)finalans;
            String choice = "";
            //use the getString method to generate the appropriate charachter in the current iteration of the loop
            password = getString(password, num, choice);
        }
        //return the generated password once the loop has ended and we have a passwiord of the desired length
        return password;
    }

    // When only Three Choices are selected
    public String threeChoices(String code, int len){
        String password = "";
        for(int i=0;i<len;i++){
            double trio = (Math.random()*(3))+0;
            double one = (Math.random()*(2-1))+1;
            double two = (Math.random()*(3-2))+2;
            double three = (Math.random()*(4-3))+3;
            double four = (Math.random()*(5-4))+4;
            double finalans=0;
            switch (code) {
                case "LUN":
                    if ((int) trio % 2 == 0) {
                        finalans = (int) trio == 0 ? one : two;
                    } else {
                        finalans = (int) trio == 0 ? one : four;
                    }
                    break;
                case "LUS":
                    if ((int) trio % 2 == 0) {
                        finalans = (int) trio == 0 ? one : two;
                    } else {
                        finalans = (int) trio == 0 ? one : three;
                    }
                    break;
                case "LNS":
                    if ((int) trio % 2 == 0) {
                        finalans = (int) trio == 0 ? one : three;
                    } else {
                        finalans = (int) trio == 0 ? one : four;
                    }
                    break;
                case "UNS":
                    if ((int) trio % 2 == 0) {
                        finalans = (int) trio == 0 ? two : three;
                    } else {
                        finalans = (int) trio == 0 ? three : four;
                    }
                    break;
            }
            int num = (int)finalans;
            String choice = "";
            password = getString(password, num, choice);
        }
        return password;
    }
}