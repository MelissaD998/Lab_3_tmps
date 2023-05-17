package strategyPattern.encryptionTypes;

import strategyPattern.PasswordEncryptionStrategy;

public class ComplexEncryptionStrategy implements PasswordEncryptionStrategy {
    @Override
    public String encrypt(String password) {
        // implementare mai complexă de criptare
        StringBuilder encryptedPassword = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            encryptedPassword.append((char)(c + 1));
        }
        return encryptedPassword.toString();
    }
}
