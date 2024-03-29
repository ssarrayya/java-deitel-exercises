/*
7.19 (Airline Reservations System) A small airline has just purchased a computer for its new
automated reservations system. You’ve been asked to develop the new system.
You’re to write an application to assign seats on each flight of the airline’s only plane
(capacity: 10 seats). Your application should display the following alternatives:
Please type 1 for First Class and Please type 2 for Economy. If the user types 1,
your application should assign a seat in the first class section (seats 1–5). If the user types 2,
your application should assign a seat in the economy section (seats 6–10). Your application should
then display a boarding pass indicating the person’s seat number and whether it’s in the first-class
or economy section of the plane. Use a one-dimensional array of primitive type boolean to represent
the seating chart of the plane. Initialize all the elements of the array to false to indicate that
all the seats are empty. As each seat is assigned, set the corresponding element of the array to
true to indicate that the seat is no longer available. Your application should never assign a seat that
has already been assigned. When the economy section is full, your application should ask the person if
it’s acceptable to be placed in the first-class section (and vice versa). If yes, make the
appropriate seat assignment. If no, display the message "Next flight leaves in 3 hours."
 */

package chapter7;

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
