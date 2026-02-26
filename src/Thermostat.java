import java.util.Scanner;

public class Thermostat extends SmartDevice{
    final String deviceName;
    final String type;
    private double temperature;
    private String status;

    public Thermostat(String deviceName) {
        this.deviceName = deviceName;
        this.type = "Thermostat";
        this.temperature = 0;
        this.status = "Off";
    }

    public void turnOn() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the desired temperature: ");
        this.temperature = sc.nextInt();
        status = "On";
    }

    public void turnOff() {
        status = "Off";
        this.temperature = 0;
    }

    public void displayDeviceStatus() {
        System.out.println("Device: " + deviceName);
        System.out.println("Type: " + type);
        System.out.println("Status: " + status);
        if (status.equals("On")) {
            System.out.println("Current Temperature: " + temperature);
        }
    }
}
