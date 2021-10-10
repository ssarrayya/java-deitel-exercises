package classtests;

public class Mp3PlayerTest{
	public static void main(String[] args){
		
		Mp3Player halleMp3Player = new Mp3Player(12, false, true, true, false, false, false);
		
		System.out.println("The mp3player is on is " + halleMp3Player.isOn());

		System.out.println("The mp3player is off is " + halleMp3Player.isOff());

		System.out.println("The mp3player is playing is " + halleMp3Player.isPlaying());

		System.out.println("The mp3player is paused is " + halleMp3Player.isPaused());

		System.out.println("The mp3player volume is " + halleMp3Player.getVolume());

		//System.out.println("The mp3player volume is " + halleMp3Player.decreaseVolume());

		System.out.println("The mp3player is on previous song is " + halleMp3Player.isPrevious());
		
		System.out.println("The mp3player is on next song is " + halleMp3Player.isNext());

	}
}