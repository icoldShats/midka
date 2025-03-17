abstract class DeviceFactory {
    abstract Device createLight(String name);
    abstract Device createCurtains(String name);

}

class BasicSmartHomeFactory extends DeviceFactory {
    @Override
    Device createLight(String name) {
        return new SmartLight(name);
    }

    @Override
    Device createCurtains(String name) {
        return new SmartCurtains(name);
    }

}


class AdvancedSmartHomeFactory extends DeviceFactory {
    @Override
    Device createLight(String name) {
        return new SmartLight(name + " (AI)");
    }

    @Override
    Device createCurtains(String name) {
        return new SmartCurtains(name);
    }

}


