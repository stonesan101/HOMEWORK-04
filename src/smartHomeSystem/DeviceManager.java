package smartHomeSystem;

import java.util.ArrayList;

public class DeviceManager extends Utility {
    private final ArrayList<SmartDevice> devices = new ArrayList<>();

    public void addDevice() {
        // Initialize a SmartDevice variable to hold the new device
        SmartDevice device;
        // Prompt the user to select a device type
        String deviceType = getUserInputString("Please select a new Light, Thermostat, or Skip: ");

        // Create a new Light or Thermostat based on user input, or skip if the user chooses to skip
        switch (deviceType) {
            case "light" -> {
                String lightName = getUserInputString("Enter the name of the Light: ");
                device = new Light(lightName);
            }
            case "thermostat" -> {
                String thermostatName = getUserInputString("Enter the name of the Thermostat: ");
                device = new Thermostat(thermostatName);
            }
            case "skip" -> {
                return;
            }
            default -> {
                IO.println("Invalid device type. Please enter 'Light' or 'Thermostat'.");
                space();
                // Recursively call addDevice() to allow the user to try again
                addDevice();
                return;
            }
        }
        space();
        // Add the newly created device to the list of devices
        devices.add(device);
    }

    public void displayAllDevices() {
        if (devices.isEmpty()) {
            IO.println("No devices added yet.");
            return;
        }
        IO.println("Displaying all devices:");
        for (SmartDevice device : devices) {
            device.displayDeviceStatus();
        }
        space();
    }
}
