package ChapterThree;

public class EmployeeTest{
	public static void main(String[] args){
		Employee sarahEmployee = new Employee("Sarah", "Akinkunmi", 400000.57);
		Employee nnennaEmployee = new Employee("Nnenna", "Onwuka", 450000.80);
	
		System.out.printf("The employee first name is %s%n", sarahEmployee.getFirstName());

		System.out.printf("The employee last name is %s%n", sarahEmployee.getLastName());

		System.out.printf("The employee monthly salary is %.2f%n", sarahEmployee.getMonthlySalary());

		System.out.printf("Sarah yearly salary is %.2f%n", sarahEmployee.yearlySalary());

		System.out.printf("Nnenna yearly salary is %.2f%n", nnennaEmployee.yearlySalary());

		System.out.printf("Sarah yearly salary is %.2f%n", sarahEmployee.raiseYearlySalary());

		System.out.printf("Nnenna yearly salary is %.2f%n", nnennaEmployee.raiseYearlySalary());

	}

}

