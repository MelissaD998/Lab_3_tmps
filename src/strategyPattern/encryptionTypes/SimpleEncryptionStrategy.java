package strategyPattern.encryptionTypes;

import strategyPattern.PasswordEncryptionStrategy;

public class SimpleEncryptionStrategy implements PasswordEncryptionStrategy {
    @Override
    public String encrypt(String password) {
        return password + "-simple";
    }
}
