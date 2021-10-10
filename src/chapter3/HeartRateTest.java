package chapter3;

public class HeartRateTest{
	public static void main(String[] args){
		
		HeartRate heartRate = new HeartRate("Sarah", "Akinkunmi", 15, 05, 2000);
		
		System.out.println("Patient first name is " + heartRate.getFirstName());

		System.out.println("Patient last name is " + heartRate.getLastName());
		
		System.out.println("Date of birth is " + heartRate.dateOfBirth());

heartRate.setAge();

		System.out.println("Patient age is " + heartRate.getAge());

heartRate.setMaxHeartRate();

		System.out.println("Maximum heart rate for patient is " + heartRate.getMaxHeartRate());

heartRate.calculateTargetHeartRate();

		System.out.println("Target heart rate for patient is " + heartRate.getTargetHeartRate());


	}

}