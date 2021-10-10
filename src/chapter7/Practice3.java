package chapter7;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
//        int[][] t = new int[2][3];
        int[][] t = {{11, 0, 4}, {9,3, 6}};

        //access expressions for all the elements in row 1 of t
        for(int row = 1; row < t.length; row++) {
            for(int column = 0; column < t[row].length; column++) {
                System.out.printf("%d%s", t[row][column], " ");
            }
        }
        System.out.println(" ");

        //access expressions for all the elements in column 2 of t
        for(int column = 2; column < t.length + 1; column++) {
            for(int row = 0; row < t.length; row++) {
                System.out.printf("%d%s%n", t[row][column], " ");
            }
        }

        //statement that sets the element of t in row 0 and column 1 to zero.
        t[0][1] = 0;

        // individual statements to initialize each element of t to zero.
        t[0][0] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;

        // nested for statement that initializes each element of t to zero
        for(int row = 0; row < t.length; row++) {
            for(int column = 0; column < t[row].length; column++) {
                t[row][column] = 0;
            }
        }

        //nested for statement that inputs the values for the elements of t from the user.
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < t.length; i++) {
            int elementValue = input.nextInt();
            for (int row = 0; row < t.length; row++) {
                for (int column = 0; column < t[row].length + 1; column++) {
                    t[row][column] = elementValue;
                }
            }
        }

        //series of statements that determines and displays the smallest value in t.
        int smallest = t[0][0];
        for(int row = 0; row < t.length; row++) {
            for (int column = 0; column < t[row].length; column++) {
                if(smallest > t[row][column])
                    smallest = t[row][column];
                //smallest = Math.min(smallest, t[row][column]);
            }
        }
        System.out.printf("%s%d%n", "The smallest value is ", smallest);


        //printf statement that displays the elements of the first row of t
        System.out.printf("%d%s%d%s%d%n", t[0][0], " ", t[0][1], " ", t[0][2]);

        //statement that totals the elements of the third column of t. Do not use repetition.
        System.out.printf("%d%n", t[0][2] + t[1][2]);

        // series of statements that displays the contents of t in tabular format. List the
        //column indices as headings across the top, and list the row indices at the left of each row.
        System.out.println("        column[0]      column[1]      column[2]");
        System.out.print("row[0]");
        for (int row = 0; row < t.length - 1; row++) {
            for (int column = 0; column < t[row].length; column++) {
                System.out.print("       " + t[row][column] + "       ");
            }
        }

        System.out.println(" ");
        System.out.print("row[1]");

        for (int row = 1; row < t.length; row++) {
            for (int column = 0; column < t[row].length; column++) {
                System.out.print("        " + t[row][column] + "      ");
            }
        }
    }
}

