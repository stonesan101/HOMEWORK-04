public class Light extends SmartDevice{
    private String deviceName;
    private String type;
    private int brightnessLevel;
    private String status;

    public Light(String deviceName) {
        this.deviceName = deviceName;
        this.type = "Light";
        this.brightnessLevel = 0;
        this.status = "Off";
    }

}
