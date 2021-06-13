package ChapterSeven;

import java.util.Scanner;

public class AirlineReservationSystem {
    static boolean[] planeSeats = new boolean[10];
    static Scanner input = new Scanner(System.in);

//    public static void displaySeat() {
//        for (boolean planeSeat : planeSeats) {
//            System.out.println(planeSeat);
//        }
//    }

    public static void firstClassChooser() {
        for(int seatNumber = 0; seatNumber < planeSeats.length - 5; seatNumber++){
            if(!planeSeats[seatNumber]) {
                System.out.println("Your seat number is " + seatNumber + "\nFirst Class");
                planeSeats[seatNumber] = true;
                break;
            }
        }

    }

    public static void economyChooser() {
        for(int seatNumber = 5; seatNumber < planeSeats.length; seatNumber++){
            if(!planeSeats[seatNumber]) {
                System.out.println("Your seat number is " + seatNumber + "\nFirst Class");
                planeSeats[seatNumber] = true;
                break;
            }
        }
    }

    public static void alternatePlacementForFirstClass() {
        System.out.println("Do you mind being placed in the economy section?");
        System.out.println("Enter 1 for yes" + "\n2 for No");

        int userSecondChoice = input.nextInt();
        if(userSecondChoice == 1) {
            System.out.println("Next flight leaves in 3 hours");
        } else if (userSecondChoice == 2) {
            economyChooser();
        } else {
            System.out.println("Wrong input!");
        }
    }

    public static void alternatePlacementForEconomy() {
        System.out.println("Do you mind being placed in the first class section?");
        System.out.println("Enter 1 for yes" + "\n2 for No");

        int userSecondChoice = input.nextInt();
        if(userSecondChoice == 1) {
            System.out.println("Next flight leaves in 3 hours");
        } else if (userSecondChoice == 2) {
            firstClassChooser();
        } else {
            System.out.println("Wrong input!");
        }
    }

    public static void main(String[] args) {
        System.out.println("""
                Please type 1 for First Class
                or type 2 for Economy""");

        int userInput = input.nextInt();
        if(userInput == 1) {
            firstClassChooser();
        } else if(userInput == 2) {
            economyChooser();
        }

        if(planeSeats[0] && planeSeats[1] && planeSeats[2] && planeSeats[3] && planeSeats[4]){
            alternatePlacementForFirstClass();
        }

        if(planeSeats[5] && planeSeats[6] && planeSeats[7] && planeSeats[8] && planeSeats[9]) {
            alternatePlacementForEconomy();
        }

    }
}
