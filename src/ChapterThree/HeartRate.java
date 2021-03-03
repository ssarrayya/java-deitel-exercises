package ChapterThree;

public class HeartRate{

	private String firstName;
	private String lastName;
	private int monthOfBirth;
	private int dayOfBirth;
	private int yearOfBirth;
	private String displayDateOfBirth;
	private int age;
	private int maxHeartRate;
	private double targetHeartRate;

	public HeartRate(String firstName, String lastName, int monthOfBirth, int dayOfBirth, int yearOfBirth){
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthOfBirth = monthOfBirth;
		this.dayOfBirth = dayOfBirth;
		this.yearOfBirth = yearOfBirth;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setMonthOfBirth(int monthOfBirth){
		this.monthOfBirth = monthOfBirth;
	}

	public int getMonthOfMonth(){
		return monthOfBirth; 
	}

	public void setDayOfBirth(int dayOfBirth){
		this.dayOfBirth = dayOfBirth;
	}

	public int getDayOfBirth(){
		return dayOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth){
		this.yearOfBirth = yearOfBirth;
	}

	public int getYearOfBirth(){
		return yearOfBirth;
	}

	public String dateOfBirth(){
		displayDateOfBirth = monthOfBirth +"/"+ dayOfBirth +"/"+ yearOfBirth;
		return displayDateOfBirth;
	}

	public void setAge(){
		age = 2021 - yearOfBirth;
	}

	public int getAge(){
		return age;
	}

	public void setMaxHeartRate(){
		maxHeartRate = 220 - age;	
	}

	public int getMaxHeartRate(){
		return maxHeartRate;
	}
	
	public void calculateTargetHeartRate(){
		targetHeartRate = 0.85 * maxHeartRate;
	}

	public double getTargetHeartRate(){
		return targetHeartRate;
	}

}