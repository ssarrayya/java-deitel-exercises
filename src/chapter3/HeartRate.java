/*
	3.16 (Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see that
your heart rate stays within a safe range suggested by your trainers and doctors. According to the American Heart Association (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736), the
formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years.
Your target heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are
estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness
and gender of the individual. Always consult a physician or qualified health-care professional before
beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes
should include the person’s first name, last name and date of birth (consisting of separate attributes for
the month, day and year of birth). Your class should have a constructor that receives this data as parameters. For each attribute provide set and get methods. The class also should include a method that
calculates and returns the person’s age (in years), a method that calculates and returns the person’s
maximum heart rate and a method that calculates and returns the person’s target heart rate. Write a
Java app that prompts for the person’s information, instantiates an object of class HeartRates and
prints the information from that object—including the person’s first name, last name and date of
birth—then calculates and prints the person’s age in (years), maximum heart rate and target-heart-rate
range.
 */

package chapter3;

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