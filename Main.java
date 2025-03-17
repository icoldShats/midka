import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Facade smartHome = new Facade();
        Scanner scanner = new Scanner(System.in);

        Room livingRoom = new Room("Living room");
        Room bedroom = new Room("bedroom");

        SmartLight light1 = new SmartLight("Lamp in the living room");
        SmartLight light2 = new SmartLight("Lamp in the bedroom");
        SmartCurtains curtains = new SmartCurtains("Curtains in the bedroom");
        SmartAC ac = new SmartAC();


        livingRoom.addDevice(light1);
        bedroom.addDevice(light2);
        bedroom.addDevice(curtains);
        bedroom.addDevice(ac);

        smartHome.addRoom(livingRoom);
        smartHome.addRoom(bedroom);

        while (true) {
            System.out.println("\select action:");
            System.out.println("1 - Enable all");
            System.out.println("2 - Turn everything off");
            System.out.println("3 - Home status");
            System.out.println("4 - Exit");
            System.out.println("Enter the command number: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> smartHome.turnEverythingOn();
                case 2 -> smartHome.turnEverythingOff();
                case 3 -> smartHome.getHomeStatus();
                case 4 -> {
                    System.out.println("Exit");
                    scanner.close();
                    return;
                }
                default -> System.out.println("not correct");
            }
        }
    }
}
