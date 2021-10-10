package chapter9.employee;

public class HourlyEmployeeTest {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Sue", "Jones", "222-22-2222", 100, 60);

        System.out.println("Employee information obtained by get methods: ");
        System.out.printf("%n%s %s%n", "First name is", hourlyEmployee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", hourlyEmployee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", hourlyEmployee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Hours worked are", hourlyEmployee.getHours());
        System.out.printf("%s %.2f%n", "Wage per hour", hourlyEmployee.getWages());

        hourlyEmployee.setHours(160);
        hourlyEmployee.setWages(200);
        System.out.println();
        System.out.printf("%s%s", "Updated employee information obtained by toString", hourlyEmployee);
    }
}
