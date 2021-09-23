/*
	3.13 (Employee Class) Create a class called Employee that includes three instance variables—a
first name (type String), a last name (type String) and a monthly salary (double). Provide a constructor that initializes the three instance variables. Provide a set and a get method for each instance
variable. If the monthly salary is not positive, do not set its value. Write a test app named EmployeeTest that demonstrates class Employee’s capabilities. Create two Employee objects and display each
object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary
again.
 */

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