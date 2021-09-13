package ChapterTen;

public class EmployeeArray {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Sarah", "Akinkunmi", "100023", 55.0);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Nnenna", "Onwuka", "100024", 60.0, 0.5);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Mayowa", "Owolabi", "100025", 60.0, 0.5, 100.0);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Francis", "Obi", "100026", 30.0, 2);
        PieceWorker pieceWorker = new PieceWorker("Priscilla", "Akinkunmi", "100027", 30.0, 20);

        Employee[] employees = new Employee[5];

        employees[0] = salariedEmployee;
        employees[1] = commissionEmployee;
        employees[2] = basePlusCommissionEmployee;
        employees[3] = hourlyEmployee;
        employees[4] = pieceWorker;

        for (Employee employee : employees){
            System.out.println(employee);
            System.out.println(employee.earnings());
            System.out.println(" ");
        }


    }
}
