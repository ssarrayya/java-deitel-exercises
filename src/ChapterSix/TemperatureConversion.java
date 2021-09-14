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
