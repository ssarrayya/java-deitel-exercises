package Assignments;

public class Television{

	private String productName;
	private int volume;
	private int channel;
	private boolean isOn;

	public Television(boolean isOn, String productName, int volume, int channel){
		this.productName = productName;
		this.isOn = isOn;
		if (this.isOn = isOn)
			this.volume = volume;
			this.channel = channel;
	}

	public void setProductName(String Samsung){
		productName = Samsung;
	}
	
	public String getProductName(){
		return productName;
	}

	public void increaseVolume(){
		volume = volume + 1;
	}

	public void decreaseVolume (){
		volume = volume - 1;
	}
	
	public int getVolume(){
		return volume;
	}

	public void setVolume (int volume){
		this.volume = volume;
	}

	public void increaseChannel(){
		channel = channel + 1;
	}

	public void decreaseChannel(){
		channel = channel - 1;
	}

	public int getChannel(){
		return channel;
	}

	public void setChannel(int channel){
		this.channel = channel;
	}

	public boolean isOn(){
		return isOn;
	}

	public void setOn(boolean isOn){
		this.isOn = isOn;
	}
}