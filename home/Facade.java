import java.util.ArrayList;
import java.util.List;
class Facade {
    private List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void turnEverythingOn() {
        System.out.println("We turn on all devices in all rooms.");
        for (Room room : rooms) {
            room.turnAllOn();
        }
    }

    public void turnEverythingOff() {
        System.out.println("Turn off all devices in all rooms");
        for (Room room : rooms) {
            room.turnAllOff();
        }
    }

    public void getHomeStatus() {
        System.out.println("smart home status:");
        if (rooms.isEmpty()) {
            System.out.println("there are no devices in it.");
            return;
        }

        for (Room room : rooms) {
            System.out.println("Room: " + room.getName());
            room.getRoomStatus();
        }
    }

}
