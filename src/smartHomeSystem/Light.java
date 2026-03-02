package smartHomeSystem;

public class Light extends SmartDevice {
    final String deviceName;
    final String type;
    private int brightnessLevel;
    private String status;

    public Light(String deviceName) {
        this.deviceName = deviceName;
        this.type = "Light";
        if (shouldTurnOn()) {
            turnOn();
        } else {
            turnOff();
        }
    }

    public void turnOn() {
        this.brightnessLevel = getUserInputInt("Enter the desired brightness level (0-100): ");
        status = "On";
    }

    public void turnOff() {
        status = "Off";
        this.brightnessLevel = 0;
    }

    public void displayDeviceStatus() {
        space();
        IO.println("Device: " + deviceName);
        IO.println("Type: " + type);
        IO.println("Status: " + status);
        if (status.equals("On")) {
            IO.println("Brightness Level: " + brightnessLevel + "%");
        }
    }

}
