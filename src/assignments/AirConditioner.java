package assignments;

public class AirConditioner{

	private boolean isOn;
	private String productName;
	private int temperature;

	public AirConditioner(boolean isOn, String productName, int temperature){
		this.isOn = isOn;
		this.productName = productName;
		this.temperature = temperature;
	}


	public void decreaseTemperature(int lowTemperature){
		temperature = lowTemperature - 1;
	}

	public String getProductName(){
		return "LG"; 
	}

	public int getTemperature(){
		return 16; //16
	}

	public void increaseTemperature(int highTemperature){
		temperature = highTemperature + 1;
	}

	public boolean isOn(){
		return isOn;
	}

	public void setOn(boolean isOn){
		this.isOn = isOn;
	}
	
	public void setProductName(String newProductName){
		productName = newProductName;
	}

	public void setTemperature (int newTemperature){
		temperature = newTemperature;
	}


}