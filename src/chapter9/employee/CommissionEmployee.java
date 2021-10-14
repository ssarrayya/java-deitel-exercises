package chapter9.employee;

/*9.14 (Employee Hierarchy) In this chapter, you studied an inheritance hierarchy in which class
BasePlusCommissionEmployee inherited from class CommissionEmployee. However, not all types of employees are
CommissionEmployees. In this exercise, you’ll create a more general Employee superclass that factors out
the attributes and behaviors in class CommissionEmployee that are common to all Employees. The common
attributes and behaviors for all Employees are firstName, lastName, socialSecurityNumber, getFirstName,
getLastName, getSocialSecurityNumber and a portion of method toString. Create a new superclass Employee
that contains these instance variables and methods and a constructor. Next, rewrite class CommissionEmployee
from Section 9.4.5 as a subclass of Employee. Class CommissionEmployee should contain only the instance
variables and methods that are not declared in superclass Employee. Class CommissionEmployee’s constructor
should invoke class Employee’s constructor and CommissionEmployee’s toString method should invoke Employee’s
toString method. Once you’ve completed these modifications, run the CommissionEmployeeTest and
BasePlusCommissionEmployeeTest apps using these new classes to ensure that the apps still display the
same results for a CommissionEmployee object and BasePlusCommissionEmployee object, respectively.
 */

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be between 0.0 and 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be between 0.0 and 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double earnings() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Gross sales: " + grossSales + "\n" +
                "Commission rate: " + commissionRate + "\n" +
                "Total earnings: " + earnings();
    }
}
