package ClassTests;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Formatter;
import java.util.Scanner;

public class StudentRecord {
    public static void createStudentFileAndAddRecords() {
        try(Formatter formatter = new Formatter("students_record.txt"); Scanner input = new Scanner(System.in)) {
            System.out.println("Enter students record and Enter + Ctrl + D to terminate program");
            formatter.format("%s %s %s %s %s %n", "Firstname", "Lastname", "level", "Year of birth", " Age");

            while (input.hasNext()) {
                String firstname = input.next();
                String lastname = input.next();
                int level = input.nextInt();
                int yearOfBirth = input.nextInt();
                formatter.format("%s %s %d %d %d%n", firstname, lastname, level, yearOfBirth, LocalDate.now().getYear() - yearOfBirth);
            }
        }
            catch (FileNotFoundException e) {
            System.err.println("Error opening file. Terminating this process.");
            System.exit(1);
        }
    }


    public static void main(String[] args) {
        createStudentFileAndAddRecords();
    }
}
