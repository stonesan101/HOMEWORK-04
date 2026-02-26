abstract class SmartDevice {
    protected boolean isOn;
    public SmartDevice() {
        this.isOn = false;
    }
    public void turnOn() {
        this.isOn = true;
    }
    public void turnOff() {
        this.isOn = false;
    }
    public void displayStatus() {
        if (isOn) {
            System.out.println("The device is ON.");
        } else {
            System.out.println("The device is OFF.");
        }
    }
}
