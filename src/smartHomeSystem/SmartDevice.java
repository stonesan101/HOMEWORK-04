package smartHomeSystem;

abstract class SmartDevice extends Utility {
    protected void turnOn() {
    }

    protected void turnOff() {
    }

    protected void displayDeviceStatus() {
    }
    // Returns true if user inputs "y" and false otherwise.
    protected Boolean shouldTurnOn() {
        return getUserInputString("Do you want to turn on the device? (y/n): ").equals("y");
    }
}
