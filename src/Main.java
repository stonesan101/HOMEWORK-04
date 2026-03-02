import smartHomeSystem.DeviceManager;
import smartHomeSystem.Utility;

public class Main extends Utility {
    void main() {
        DeviceManager deviceManager = new DeviceManager();
        int numDevices = getUserInputInt("How many devices do you want to add?  ");
        for (int i = 0; i < numDevices; i++) {
            deviceManager.addDevice();
        }
        deviceManager.displayAllDevices();
    }
}
