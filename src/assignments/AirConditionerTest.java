package assignments;

public class AirConditionerTest{

	public static void main(String[] args){

		AirConditioner sarahAirConditioner = new AirConditioner(true, "LG", 29);

		System.out.printf("The product name is %s%n", sarahAirConditioner.getProductName());
	
		System.out.printf("The air conditioner is on is %s%n", sarahAirConditioner.isOn());

		System.out.printf("The temperature is %d%n", sarahAirConditioner.getTemperature());
	

	}
	


}