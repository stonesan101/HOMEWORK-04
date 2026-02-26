public class Light extends SmartDevice{
    final String deviceName;
    final String type;
    private int brightnessLevel;
    private String status;

    public Light(String deviceName) {
        this.deviceName = deviceName;
        this.type = "Light";
        this.brightnessLevel = 0;
        this.status = "Off";
    }

    public void turnOn(int brightnessLevel) {
        this.brightnessLevel = brightnessLevel;
        status = "On";
    }

    public void turnOff() {
        status = "Off";
        this.brightnessLevel = 0;
    }

    public void displayDeviceStatus() {
        System.out.println("Device: " + deviceName);
        System.out.println("Type: " + type);
        System.out.println("Status: " + status);
        if (status.equals("On")) {
            System.out.println("Brightness Level: " + brightnessLevel);
        }
    }

}
