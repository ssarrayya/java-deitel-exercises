package ClassTests;

public class Mp3Player{
	private int volume;
	private boolean isOn;
	private boolean isOff;
	private boolean isPaused;
	private boolean isPlaying;
	private boolean isNext;
	private boolean isPrevious;

	public Mp3Player(int volume, boolean isOff, boolean isOn, boolean isPlaying, boolean isPaused, boolean isNext, 
boolean isPrevious){
		this.isOn = isOn;
		this.isOff = isOff;
		if(this.isOn =isOn)
			this.isOff = isOn;
			this.volume = volume;
			this.isPlaying = isPlaying;
			this.isPaused = isPaused;
			this.isNext = isNext;
			this.isPrevious = isPrevious;
	}

	public void increaseVolume(){
		volume = volume + 1;
	}

	public void decreaseVolume(){
		volume = volume - 1;
	}

	public int getVolume(){
		return volume;
	}

	public void setVolume(int volume){
		this.volume = volume;
	}

	public boolean isOn(){
		return isOn;
	}

	public void setOn(boolean isOn){
		this.isOn = isOn;
	}

	public boolean isOff(){
		return isOn;
	}

	public void setOff(boolean isOff){
		this.isOff = isOff;
	}

	public boolean isPaused(){
		return isPaused;
	}

	public void setPaused(boolean isPaused){
		this.isPaused = isPaused;
	}

	public boolean isPlaying(){
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying){
		this.isPlaying = isPlaying;
	}

	public boolean isPrevious(){
		return isPrevious;
	}

	public void setPrevious(boolean isPrevious){
		this.isPrevious = isPrevious;
	}

	public boolean isNext(){
		return isNext;
	}

	public void setNext(boolean isNext){
		this.isNext = isNext;
	}


}