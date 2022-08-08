package src.usecases;

import static src.entities.PasswordGenerator.generateLCLetters;
import static src.entities.PasswordGenerator.generateUCLetters;
import static src.entities.PasswordGenerator.generateNumbers;
import static src.entities.PasswordGenerator.generateSymbols;

public class GenerateNewPassword {
    // Generating Class Methods for the GenerateNewPassword Use Case

    // When all checkboxes are selected
    public String lowUpSymNum(int len) {
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
            case 1 -> choice = generateLCLetters(1);
            case 2 -> choice = generateUCLetters(1);
            case 3 -> choice = generateSymbols(1);
            case 4 -> choice = generateNumbers(1);
            default -> {
            }
        }
        password += choice;
        return password;
    }

    // When only Two Choices are selected
    public String twoChoices(String code,int len){
        String password = "";
        for(int i=0;i<len;i++){
            double binar = (Math.random()*(2))+0;     // Random number 1 or 2
            double one = (Math.random()*(2-1))+1;       // Random number 1
            double two = (Math.random()*(3-2))+2;       // Random number 2
            double three = (Math.random()*(4-3))+3;     // Random number 3
            double four = (Math.random()*(5-4))+4;      // Random number 4
            double finalans = switch (code) {
                case "LS", "SL" -> (int) binar == 0 ? one : three;
                // When lowercase letters checkbox & numbers checkbox are selected
                case "LN", "NL" -> (int) binar == 0 ? one : four;
                // When lowercase letters checkbox & uppercase letters' checkbox are selected
                case "LU", "UL" -> (int) binar == 0 ? one : two;
                // When uppercase letters checkbox & numbers checkbox are selected
                case "UN", "NU" -> (int) binar == 0 ? two : four;
                // When symbols checkbox & uppercase letters' checkbox are selected
                case "SU", "US" -> (int) binar == 0 ? three : two;
                // When numbers checkbox & symbols checkbox are selected
                case "NS", "SN" -> (int) binar == 0 ? four : three;
                default -> 0;
                //When lowercase letters checkbox & symbols checkbox are selected
            };
            int num = (int)finalans;
            String choice = "";
            password = getString(password, num, choice);
        }
        return password;
    }

    // When only Three Choices are selected
    public String threeChoices(String code,int len){
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
                case "ULN":
                case "NLU":
                    if ((int) trio % 2 == 0) {
                        finalans = (int) trio == 0 ? one : two;
                    } else {
                        finalans = (int) trio == 0 ? one : four;
                    }
                    break;
                case "LUS":
                case "USL":
                case "SLU":
                    if ((int) trio % 2 == 0) {
                        finalans = (int) trio == 0 ? one : two;
                    } else {
                        finalans = (int) trio == 0 ? one : three;
                    }
                    break;
                case "LNS":
                case "NLS":
                case "SNL":
                    if ((int) trio % 2 == 0) {
                        finalans = (int) trio == 0 ? one : three;
                    } else {
                        finalans = (int) trio == 0 ? one : four;
                    }
                    break;
                case "UNS":
                case "SUN":
                case "NUS":
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