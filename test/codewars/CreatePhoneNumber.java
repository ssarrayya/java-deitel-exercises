package codewars;

/*
Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

Example
Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 */
public class CreatePhoneNumber {
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        System.out.println(Math.round(meal_cost +
                ((1.0 *tip_percent / 100) * meal_cost) +
                ((1.0 * tax_percent / 100) * meal_cost)));
    }
}
