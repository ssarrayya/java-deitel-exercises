package ChapterThree;

public class Employee{
	private String firstName;
	private String lastName;
	private double monthlySalary;
	private double yearlySalary;
	private double raiseYearlySalary;

	public Employee(String firstName, String lastName, double monthlySalary){
		this.firstName = firstName;
		this.lastName = lastName;
		if(monthlySalary > 0.00){
			this.monthlySalary = monthlySalary;
		}
	}
	
	public void setFirstName(String sarah){
		firstName = sarah;
	}
	
	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String akinkunmi){
		lastName = akinkunmi;
	}

	public String getLastName(){
		return lastName;
	}

	public void setMonthlySalary(double monthlySalary){
		this.monthlySalary = monthlySalary;
	}

	public double getMonthlySalary(){
		return monthlySalary;
	}

	public double yearlySalary(){
		return yearlySalary = monthlySalary * 12;
	}

	public double raiseYearlySalary(){
		return yearlySalary = yearlySalary + (0.1 * yearlySalary);
	}
}