package iteratorPattern;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("----- Meniu -----");
            System.out.println("1. Adăugare carte");
            System.out.println("2. Afișare cărți");
            System.out.println("3. Ieșire");
            System.out.print("Selectați o opțiune: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consumăm newline

            switch (choice) {
                case 1:
                    System.out.print("Introduceți titlul cărții: ");
                    String title = scanner.nextLine();
                    System.out.print("Introduceți autorul cărții: ");
                    String author = scanner.nextLine();
                    Book book = new Book(title, author);
                    library.addBook(book);
                    System.out.println("Cartea a fost adăugată în bibliotecă.");
                    break;
                case 2:
                    System.out.println("Cărțile din bibliotecă:");
                    LibraryIterator iterator = library.createIterator();
                    while (iterator.hasNext()) {
                        Book currentBook = iterator.next();
                        System.out.println("Titlu: " + currentBook.getTitle() + ", Autor: " + currentBook.getAuthor());
                    }
                    break;
                case 3:
                    System.out.println("Aplicația se închide...");
                    break;
                default:
                    System.out.println("Opțiune invalidă. Vă rugăm să selectați o opțiune validă.");
                    break;
            }

            System.out.println();
        } while (choice != 3);

        scanner.close();
    }
}