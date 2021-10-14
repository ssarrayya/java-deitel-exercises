package chapter10.payrollsystem;

import chapter8.Date;

public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[7];

        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00, new Date(5, 20, 2009));
        payableObjects[3] = new PieceWorker("Lisa", "Barnes", "888-88-8888", new Date(7, 27, 2009), 8.7, 69);
        payableObjects[4] = new HourlyEmployee("Toni", "Adeniyi", "555-55-5555", new Date(2, 4, 1998), 10.9, 5.6);
        payableObjects[5] = new CommissionEmployee("Francis", "Obi", "444-44-4444", new Date(11, 3, 1998), 40.9, 0.7);
        payableObjects[6] = new BasePlusCommissionEmployee("Damilare", "Jolayemi", "999-99-9999", new Date(9, 27, 1996), 40.9, 0.5,2);

        System.out.println("Invoices and Employees processed polymorphically:");

        for (Payable currentPayable : payableObjects) {
            if(currentPayable instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentPayable;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is: $%.2f%n", employee.getBaseSalary());
            }
            System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), "payment due", currentPayable.getPaymentAmount());
        }
    }
}
