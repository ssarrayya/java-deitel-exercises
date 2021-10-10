/*
6.8 (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
longer than 24 hours at a time. Write an application that calculates and displays the parking charges
for each customer who parked in the garage yesterday. You should enter the hours parked for each
customer. The program should display the charge for the current customer and should calculate and
display the running total of yesterday’s receipts. It should use the method calculateCharges
to determine the charge for each customer.
 */

package chapter6;

public class ParkingCharges {
    public void calculateCharges(int hoursParked) {
        double charges = 2.00;
        charges += (hoursParked - 3) * 0.50;
        if(charges > 10.00){
            charges = 10.00;
            System.out.println("Total charge is " + charges);
        }
        System.out.println("Total charge is " + charges);
    }
}