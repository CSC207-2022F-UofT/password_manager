package src.entities;

public abstract class Password {
    String passwordValue;

    /**
     * Both methods should be over-ridden by child classes.
     */
    public String getPassword() {return null;}
    public void setPassword(String password) {
        passwordValue = password;
    }
}
