package chapter9.employee;

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
