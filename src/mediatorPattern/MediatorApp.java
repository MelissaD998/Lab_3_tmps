package mediatorPattern;

import java.util.Scanner;

public class MediatorApp {
    public static void main(String[] args) {
        HotelMediator hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("----- Meniu -----");
            System.out.println("1. Rezervare cameră");
            System.out.println("2. Afisare camere disponibile");
            System.out.println("3. Ieșire");
            System.out.print("Selectați o opțiune: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consumăm newline

            switch (choice) {
                case 1:
                    System.out.print("Introduceți numărul camerei: ");
                    int roomNumber = scanner.nextInt();
                    scanner.nextLine(); // Consumăm newline
                    System.out.print("Introduceți numele dumneavoastră: ");
                    String guestName = scanner.nextLine();
                    hotel.bookRoom(roomNumber, guestName);
                    break;
                case 2:
                    hotel.displayAvailableRooms();
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

