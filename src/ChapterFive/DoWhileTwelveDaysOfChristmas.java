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
                case 1 -> System.out.println("a partridge in a pear tree\n");
                case 2 -> System.out.println("Two turtle doves and a partridge in a pear tree \n");
                case 3 -> System.out.println("Three French hens, two turtle doves and a partridge in a pear tree \n");
                case 4 -> System.out.println("""
                        Four calling birds, three French hens
                        Two turtle doves and a partridge in a pear tree
                                                    
                        """);
                case 5 -> System.out.println("""
                        Five gold rings, four calling birds, three French hens
                        Two turtle doves and a partridge in a pear tree
                                                    
                        """);
                case 6 -> System.out.println("""
                        Six geese a laying, five gold rings
                        Four calling birds, three French hens
                        Two turtle doves and a partridge in a pear tree 
                        """);
                case 7 -> System.out.println("""
                        Seven swans a swimming, six geese a laying, five gold rings
                        Four calling birds, three French hens
                        Two turtle doves and a partridge in a pear tree 
                        """);
                case 8 -> System.out.println("""
                        Eight maids a milking, seven swans a swimming
                        Six geese a laying, five gold rings
                        Four calling birds, three French hens
                        Two turtle doves and a partridge in a pear tree
                        """);
                case 9 -> System.out.println("""
                        Nine ladies dancing, eight maids a milking
                        Seven swans a swimming, six geese a laying, five gold rings
                        Four calling birds, three French hens
                        Two turtle doves and a partridge in a pear tree
                        """);
                case 10 -> System.out.println("""
                        Ten lords a leaping, nine ladies dancing, eight maids a milking
                        Seven swans a swimming, six geese a laying, five gold rings
                        Four calling birds, three French hens
                        Two turtle doves and a partridge in a pear tree
                        """);
                case 11 -> System.out.println("""
                        Eleven pipers piping, ten lords a leaping
                        Nine ladies dancing, eight maids a milking
                        Seven swans a swimming, six geese a laying, five gold rings
                        Four calling birds, three French hens
                        Two turtle doves and a partridge in a pear tree
                        """);
                case 12 -> System.out.println("""
                        Twelve drummers drumming, eleven pipers piping
                        Ten lords a leaping, nine ladies dancing, eight maids a milking
                        Seven swans a swimming, six geese a laying, five gold rings
                        Four calling birds, three French hens
                        Two turtle doves and a partridge in a pear tree
                        """);
                default -> System.out.println(" ");
            }
            daysOfChristmas++;
        }

        while (daysOfChristmas <= 12);

    }
}
