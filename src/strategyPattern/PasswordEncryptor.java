package strategyPattern;

public class PasswordEncryptor {
    private PasswordEncryptionStrategy strategy;

    public void setStrategy(PasswordEncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public String encrypt(String password) {
        return strategy.encrypt(password);
    }
}
