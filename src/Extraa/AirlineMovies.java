package Extraa;

public class AirlineMovies {
    /*Users on longer flights like to start a second movie right when their first one ends, but
    they complain that the plane usually lands before they can see the ending. So you're building
    a feature for choosing two movies whose total runtimes will equal the exact flight length.

    Write a function that takes an integer flight_length(in minutes) and a list of integers
    movie_lengths(in minutes) and returns a boolean indicating whether there are two movies in
    movie_length whose sum equals flight_length.

    When building your function:
    1. Assume your users will watch exactly two movies
    2. Don't make your users watch the same movie twice
    3. Optimize for runtime over memory*/

    static int flightLength = 120;
    static int[] movieLength = {20, 100, 50, 20, 30, 70, 10};

    public static boolean isSumEqualToFlightLength() {
        for(int i = 0; i < movieLength.length; i++){
            for(int j = i + 1; j < movieLength.length; j++){
                if(movieLength[i] + movieLength[j] == flightLength){
                    return true;
                }
            }
        }
        return false;
    }

    //to tell user what movies are equal to the flight length
    public static void moviesThatEqualFlightLength() {
        for(int i = 0; i < movieLength.length; i++){
            for(int j = i + 1; j < movieLength.length; j++){
                if(movieLength[i] + movieLength[j] == flightLength){
                    System.out.printf("%s%d%s%d%s%n", "Movie ", i + 1, " and movie ", j + 1, " equal flight length");
                }
            }
        }
    }

}
