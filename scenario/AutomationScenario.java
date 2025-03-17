class AutomationScenario {
    private String name;
    private Runnable action;

    public AutomationScenario(String name, Runnable action) {
        this.name = name;
        this.action = action;
    }

    public void execute() {
        System.out.println(" script executed: " + name);
        action.run();
    }
}

class NightModeScenario implements Runnable {
    private Facade smartHome;

    public NightModeScenario(Facade smartHome) {
        this.smartHome = smartHome;
    }

    @Override
    public void run() {
        smartHome.turnEverythingOff();
    }
}

class GoodMorningScenario implements Runnable {
    private Facade smartHome;

    public GoodMorningScenario(Facade smartHome) {
        this.smartHome = smartHome;
    }

    @Override
    public void run() {
        smartHome.turnEverythingOn();
    }
}
