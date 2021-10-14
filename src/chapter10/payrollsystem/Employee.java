package chapter10.payrollsystem;

import chapter8.Date;

/*
10.12 (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include private instance
variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an employee’s birthday. Add get
methods to class Date. Assume that payroll is processed once per month. Create an array of Employee variables
to store references to the various employee objects. In a loop, calculate the payroll for each Employee
(polymorphically), and add a $100.00 bonus to the person’s payroll amount if the current month is the one
in which the Employee’s birthday occurs.
 */

public abstract class Employee implements Payable{
    private final String firstName;
    private final String lastName;
    private final Date birthDate;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s%nSocial security number: %s",
                getFirstName(), getLastName(), getBirthDate(), getSocialSecurityNumber());
    }
    public abstract double earnings();
    public double getPaymentAmount() {
        return earnings();
    }
}
