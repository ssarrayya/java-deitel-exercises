package ChapterThree;

public class TryOutAirConditionerTest {
    public static void main(String[] args) {
        TryOutAirConditioner sarahAirConditioner = new TryOutAirConditioner("LG", true, 19);

        System.out.println("The product name is " + sarahAirConditioner.getProductName());
        System.out.println("The air conditioner is on is " + sarahAirConditioner.isOn());
        System.out.println("The air conditioner's temperature is " + sarahAirConditioner.getTemperature() + " degree Centigrade" );
    }
}
