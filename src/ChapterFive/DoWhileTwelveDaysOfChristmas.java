/*
5.29 (“The Twelve Days of Christmas” Song) Write an application that uses repetition and
switch statements to print the song “The Twelve Days of Christmas.” One switch statement should
be used to print the day (“first,” “second,” and so on). A separate switch statement should be used
to print the remainder of each verse. Visit the website en.wikipedia.org/wiki/The_Twelve_Days_
of_Christmas_(song) for the lyrics of the song.
 */

package ChapterFive;

public class DoWhileTwelveDaysOfChristmas {
    public static void main(String[] args) {
        int daysOfChristmas = 1;

        do{
            switch(daysOfChristmas) {
                case 1 -> System.out.print("On the first");
                case 2 -> System.out.print("On the second");
                case 3 -> System.out.print("On the third");
                case 4 -> System.out.print("On the fourth");
                case 5 -> System.out.print("On the fifth");
                case 6 -> System.out.print("On the sixth");
                case 7 -> System.out.print("On the seventh");
                case 8 -> System.out.print("On the eighth");
                case 9 -> System.out.print("On the ninth");
                case 10 -> System.out.print("On the tenth");
                case 11 -> System.out.print("On the eleventh");
                case 12 -> System.out.print("On the twelfth");
                default -> System.out.print(" ");
            }
            System.out.println(" day of Christmas, my true love sent to me, ");

            switch (daysOfChristmas) {
                case 12 -> System.out.println("Twelve drummers drumming, ");
                case 11 -> System.out.println("Eleven pipers piping, ");
                case 10 -> System.out.println("Ten lords a leaping, ");
                case 9 -> System.out.println("Nine ladies dancing, ");
                case 8 -> System.out.println("Eight maids a milking, ");
                case 7 -> System.out.println("Seven swans a swimming, ");
                case 6 -> System.out.println("Six geese a laying, ");
                case 5 -> System.out.println("Five gold rings, ");
                case 4 -> System.out.println("Four calling birds, ");
                case 3 -> System.out.println("Three French hens, ");
                case 2 -> System.out.println("Two turtle doves ");
                case 1 -> System.out.println("and a partridge in a pear tree.");

                default -> System.out.println(" ");
            }
            daysOfChristmas++;
        }

        while (daysOfChristmas <= 12);

    }
}
