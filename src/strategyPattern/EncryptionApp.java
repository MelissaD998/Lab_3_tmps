package strategyPattern;

import strategyPattern.encryptionTypes.ComplexEncryptionStrategy;
import strategyPattern.encryptionTypes.SimpleEncryptionStrategy;

import java.util.Scanner;

public class EncryptionApp {
    static PasswordEncryptor passwordEncryptor = new PasswordEncryptor();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");

        String password = scanner.nextLine();
        System.out.println("Select encryption type: ");
        System.out.println("1. Simple encryption");
        System.out.println("2. Complex encryption");
        String encryptionType = scanner.nextLine();

        if (encryptionType.equals("1")) {
            passwordEncryptor.setStrategy(new SimpleEncryptionStrategy());
        } else if (encryptionType.equals("2")) {
            passwordEncryptor.setStrategy(new ComplexEncryptionStrategy());
        } else {
            System.out.println("Invalid encryption type");
        }

        String encryptedPassword = passwordEncryptor.encrypt(password);
        System.out.println("Encrypted password: " + encryptedPassword);
    }
}
