package mediatorPattern;

public class Room {
    private int roomNumber;
    private boolean booked;
    private String guestName;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isBooked() {
        return booked;
    }

    public void book(String guestName) {
        this.booked = true;
        this.guestName = guestName;
    }
}
