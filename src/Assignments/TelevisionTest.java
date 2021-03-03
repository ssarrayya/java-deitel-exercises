package Assignments;

public class TelevisionTest{

	public static void main(String[] args){

		Television samsungTelevision = new Television(false, "Samsung", 301, 22);
		
		System.out.printf("The television brand is %s%n", samsungTelevision.getProductName());

		System.out.printf("The television is on is %b%n", samsungTelevision.isOn());
		
		System.out.printf("The channel is %d%n", samsungTelevision.getChannel());
		
		samsungTelevision.setVolume(22);
		System.out.printf("The volume is %d%n", samsungTelevision.getVolume());

		
	}
}