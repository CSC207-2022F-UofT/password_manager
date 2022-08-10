package entities;

public abstract class Password {
    String passwordValue;

    /**
     * Both methods should be over-ridden by child classes.
     */
    public String getPassword() {return passwordValue;}
    public void setPassword(String password) {
        passwordValue = password;
    }
}
