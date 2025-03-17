class OldLockSystem {
    void lock() {
        System.out.println("castle is closed");
    }

    void unlock() {
        System.out.println("castle is open");
    }

    boolean isLocked() {
        return Math.random() > 0.5; // Симуляция состояния
    }
}

class SmartLockAdapter implements Device {
    private String name;
    private OldLockSystem oldLock;

    public SmartLockAdapter(String name, OldLockSystem oldLock) {
        this.name = name;
        this.oldLock = oldLock;
    }

    @Override
    public void turnOn() {
        oldLock.unlock();
    }

    @Override
    public void turnOff() {
        oldLock.lock();
    }

    @Override
    public String getStatus() {
        return name + " " + (oldLock.isLocked() ? "blocked" : "unblocked");
    }
}
