package chapter3;

public class TryOutAirConditioner {

    private boolean isOn;
    private String productName;
    private int temperature;

    public TryOutAirConditioner (String productName, boolean isOn, int temperature){
        this.productName = productName;
        this.isOn = isOn;
        this.temperature = temperature;
    }

    public void decreaseTemperature (int lowerTemperature){
        lowerTemperature = temperature - 1 ;
    }

    public String getProductName() {
        return "Haier Thermocool";
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature (int higherTemperature) {
        higherTemperature = temperature + 1;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public  void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
