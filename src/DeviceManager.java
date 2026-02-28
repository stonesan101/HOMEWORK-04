import java.util.ArrayList;
import java.util.Scanner;

public class DeviceManager {
    private final ArrayList<SmartDevice> devices = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    public void addDevice() {
        IO.print("Please select a new Light, Thermostat, or Exit: ");
        String deviceType = sc.nextLine().trim().toLowerCase();
        switch (deviceType) {
            case "light" -> {
                System.out.print("Enter the name of the Light: ");
                String lightName = sc.nextLine();
                devices.add(new Light(lightName));
                break;
            }
            case "thermostat" -> {
                System.out.print("Enter the name of the Thermostat: ");
                String thermostatName = sc.nextLine();
                devices.add(new Thermostat(thermostatName));
                break;
            }
            case "exit" -> {
                break;
            }
            default -> {
                System.out.println("Invalid device type. Please enter 'Light' or 'Thermostat'.\n ---------------------------------");
                addDevice();
                break;
            }
        }
    }

    public void displayAllDevices() {
        IO.println("Displaying all devices:");
        if(devices.isEmpty()) {
            IO.println("No devices added yet.");
            return;
        }
        for (SmartDevice device : devices) {
            device.displayDeviceStatus();
        }
    }
}
