import java.util.ArrayList;
import java.util.List;

class Room {
    private String name;
    private List<Device> devices;

    public Room(String name) {
        this.name = name;
        this.devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void turnAllOn() {
        for (Device device : devices) {
            device.turnOn();
        }
    }

    public void turnAllOff() {
        for (Device device : devices) {
            device.turnOff();
        }
    }

    public String getName() {
        return name;
    }

    public void getRoomStatus() {
        System.out.println("Status room " + name + ":");
        for (Device device : devices) {
            System.out.println(" - " + device.getStatus());
        }
    }
}
