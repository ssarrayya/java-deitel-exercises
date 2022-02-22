package chapter15.filematchingwithmultipletransactions;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateAccountFile {
    private static Formatter output;
    private static final Scanner scanner = new Scanner(System.in);

    public static void openFile() {
        try {
            output = new Formatter("src\\chapter15\\filematchingwithmultipletransactions\\files\\oldmast.txt");
        } catch (SecurityException e) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        } catch (FileNotFoundException e) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    public static void addRecords() {
        System.out.printf("%s%n%s%n* ",
                "Enter account number, first name, last name and account balance",
                "Enter end-of-file indicator to end input.");

        while (scanner.hasNext()) {
            try{
                output.format("%d %s %s %.2f%n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble());
            } catch (FormatterClosedException e) {
                System.err.println("Error writing to file. Terminating.");
                break;
            } catch (NoSuchElementException e) {
                System.err.println("Invalid input. Please try again.");
                scanner.nextLine();
            }
            System.out.print("* ");
        }
    }

    public static void closeFile() {
        if (output != null) output.close();
    }

    public static void main(String[] args) {
        try {
            openFile();
            addRecords();
            closeFile();
        } finally {
            scanner.close();
        }
    }
}
