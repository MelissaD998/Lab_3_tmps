package mediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Hotel implements HotelMediator {
    private List<Room> rooms;

    public Hotel() {
        this.rooms = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            rooms.add(new Room(i));
        }
    }

    public void bookRoom(int roomNumber, String guestName) {
        Room room = findRoom(roomNumber);
        if (room != null) {
            room.book(guestName);
            System.out.println("Camera " + roomNumber + " a fost rezervată de către " + guestName + ".");
        } else {
            System.out.println("Nu există o cameră cu numărul " + roomNumber + ".");
        }
    }

    public void displayAvailableRooms() {
        System.out.println("Camere disponibile:");
        for (Room room : rooms) {
            if (!room.isBooked()) {
                System.out.println("Camera " + room.getRoomNumber());
            }
        }
    }

    private Room findRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
}