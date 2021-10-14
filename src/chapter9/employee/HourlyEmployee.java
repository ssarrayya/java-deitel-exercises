package chapter9.employee;

/* 9.15 (Creating a New Subclass of Employee) Other types of Employees might include SalariedEmployees who
get paid a fixed weekly salary, PieceWorkers who get paid by the number of pieces they produce or
HourlyEmployees who get paid an hourly wage with time-and-a-half—1.5 times the hourly wage—for hours worked
over 40 hours. Create class HourlyEmployee that inherits from class Employee (Exercise 9.14) and has instance
variable hours (a double) that represents the hours worked, instance variable wage (a double) that represents
the wages per hour, a constructor that takes as arguments a first name, a last name, a social security number,
an hourly wage and the number of hours worked, set and get methods for manipulating the hours and wage, an
earnings method to calculate an HourlyEmployee’s earnings based on the hours worked and a toString method that
returns the HourlyEmployee’s String representation. Method setWage should ensure that wage is nonnegative, and
setHours should ensure that the value of hours is between 0 and 168 (the total number of hours in a week). Use
class HourlyEmployee in a test program that’s similar to the one in Fig. 9.5.
 */

public class HourlyEmployee extends Employee{
    private double hours;
    private double wages;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wages, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        if (hours < 0.0 || hours > 168) {
            throw new IllegalArgumentException("Hours worked must be more than 0");
        }
        this.hours = hours;
        if(wages < 0) {
            throw new IllegalArgumentException("Wages should be more than 0");
        }
        this.wages = wages;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168) {
            throw new IllegalArgumentException("Hours worked must be more than 0");
        }
        this.hours = hours;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        if(wages < 0) {
            throw new IllegalArgumentException("Wages should be more than 0");
        }
        this.wages = wages;
    }

    public double earnings() {
        int maxHours = 40;
        double overTime = 1.5;
        double earnings;
        if(hours <= 40) {
            earnings = hours * wages;
        } else {
            earnings = (hours - maxHours) * overTime * wages + (maxHours * wages);
        }
        return earnings;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Hours worked: " + hours + "\n" +
                "Wages per hour: " + wages;
    }
}
