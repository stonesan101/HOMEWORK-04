package smartHomeSystem;

public class Thermostat extends SmartDevice {
    final String deviceName;
    final String type;
    private int temperature;
    private String status;

    public Thermostat(String deviceName) {
        this.deviceName = deviceName;
        this.type = "Thermostat";
        if(shouldTurnOn()){
            turnOn();
        }else{
            turnOff();
        }
    }

    public void turnOn() {
        this.temperature =  getUserInputInt("Enter the desired temperature in F: ");
        status = "On";
    }

    public void turnOff() {
        status = "Off";
        this.temperature = 0;
    }

    public void displayDeviceStatus() {
        space();
        IO.println("Device: " + deviceName);
        IO.println("Type: " + type);
        IO.println("Status: " + status);
        if (status.equals("On")) {
            IO.println("Current Temperature: " + temperature + "°F");
        }
    }
}
