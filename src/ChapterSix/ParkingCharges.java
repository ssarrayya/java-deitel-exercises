package ChapterSix;

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