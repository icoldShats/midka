
interface Device {
    void turnOn();
    void turnOff();
    String getStatus();
}

class SmartLight implements Device {
    private boolean isOn = false;
    private String name;

    public SmartLight(String name) { // Добавленный конструктор
        this.name = name;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " off");
    }

    public String getStatus() {
        return name + " " + (isOn ? "on" : "off");
    }
}

class SmartAC implements Device {
    private boolean isOn = false;
    private int temperature = 24;

    public void turnOn() {
        isOn = true;
        System.out.println("Condik on, temperature: " + temperature + "°C");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Condik off");
    }

    public void setTemperature(int temp) {
        if (isOn) {
            temperature = temp;
            System.out.println("temperature on " + temp + " degrees");
        } else {
            System.out.println("Temperature cannot be changed");
        }
    }

    public String getStatus() {
        return "Condic " + (isOn ? "on, temperature: " + temperature + "°C" : "off");
    }
}

class SmartCurtains implements Device {
    private boolean isOpen = false;
    private String name;

    public SmartCurtains(String name) {
        this.name = name;
    }

    public void turnOn() {
        isOpen = true;
        System.out.println(name + " open");
    }

    public void turnOff() {
        isOpen = false;
        System.out.println(name + " close");
    }

    public String getStatus() {
        return name + " " + (isOpen ? "open" : "close");
    }
}





