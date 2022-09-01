package entities;

public abstract class Password {
    String passwordValue;

    /**
     * Methods can be over-ridden by child classes.
     */
    public String getPassword() {return null;}
    public void setPassword(String password) {
        passwordValue = password;
    }
}
