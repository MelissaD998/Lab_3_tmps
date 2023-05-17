package mediatorPattern;

public interface HotelMediator {
    void bookRoom(int roomNumber, String guestName);
    void displayAvailableRooms();
}
