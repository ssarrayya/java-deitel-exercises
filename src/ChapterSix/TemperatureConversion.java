/*
6.22 (Temperature Conversions) Implement the following integer methods:
a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the
calculation
celsius = 5.0 / 9.0 * (fahrenheit - 32);
b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using
the calculation
fahrenheit = 9.0 / 5.0 * celsius + 32;
c) Use the methods from parts (a) and (b) to write an application that enables the user
either to enter a Fahrenheit temperature and display the Celsius equivalent or to enter a
Celsius temperature and display the Fahrenheit equivalent.
 */

package ChapterSix;

public class TemperatureConversion {
    public static double fahrenheitToCelsius(double fhTemp) {
        return (5.0 / 9.0) * (fhTemp - 32);
    }

    public static double celsiusToFahrenheit(double csTemp) {
        return (9.0 / 5.0 * csTemp) + 32;
    }

    public static void main(String[] args) {
        System.out.println(fahrenheitToCelsius(89.6));
        System.out.println(celsiusToFahrenheit(32));
    }
}
