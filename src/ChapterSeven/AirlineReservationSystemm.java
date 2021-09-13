package ChapterSeven;

import java.util.Scanner;

public class AirlineReservationSystemm {
    static boolean[] planeSeats = new boolean[10];

    public static boolean firstClassChooser() {
        for(int seatNumber = 0; seatNumber < planeSeats.length - 5; seatNumber++){
            if(!planeSeats[seatNumber]) {
                System.out.println("Your seat number is " + seatNumber + "\nFirst Class");
                planeSeats[seatNumber] = true;
                break;
            }
        }
        return true;
    }

    public static boolean economyChooser() {
        for(int seatNumber = 5; seatNumber < planeSeats.length; seatNumber++){
            if(!planeSeats[seatNumber]) {
                System.out.println("Your seat number is " + seatNumber + "\nFirst Class");
                planeSeats[seatNumber] = true;
                break;
            }
        }
        return true;
    }

    public static void alternatePlacementForFirstClass() {
        System.out.println("Do you mind being placed in the economy section?");
        System.out.println("Enter 1 for yes" + "\n2 for No");

        Scanner input = new Scanner(System.in);
        int userSecondChoice = input.nextInt();
        if(userSecondChoice == 1) {
            System.out.println("Next flight leaves in 3 hours");
        } else if (userSecondChoice == 2) {
            economyChooser();
        } else {
            System.out.println("Wrong input!");
        }
    }
}
