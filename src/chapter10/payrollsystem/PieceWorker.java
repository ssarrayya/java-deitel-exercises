package chapter10.payrollsystem;

import chapter8.Date;

/*
10.14 (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include an additional
Employee subclass PieceWorker that represents an employee whose pay is based on the number of pieces of
merchandise produced. Class PieceWorker should contain private instance variables wage (to store the
employee’s wage per piece) and pieces (to store the number of pieces produced). Provide a concrete
implementation of method earnings in class PieceWorker that calculates the employee’s earnings by multiplying
the number of pieces produced by the wage per piece. Create an array of Employee variables to store references
to objects of each concrete class in the new Employee hierarchy. For each Employee, display its String
representation and earnings.
 */

public class PieceWorker extends Employee {
    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if(wage < 0) {
            throw new IllegalArgumentException("Wages per pieces should be more than 0");
        }
        this.wage = wage;
        if(pieces < 0) {
            throw new IllegalArgumentException("Number of pieces should be more than 0");
        }
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public int getPieces() {
        return pieces;
    }

    public double earnings() {
        return wage * pieces;
    }

    @Override
    public String toString() {
        return String.format("Piece worker: %s%n%s%.2f%n%s%d",
                super.toString(), "wage per piece: $", getWage(),
                "Pieces made: ", getPieces());
    }

    @Override
    public double getPaymentAmount() {
        return earnings();
    }
}
