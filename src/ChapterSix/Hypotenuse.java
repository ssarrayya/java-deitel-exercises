package ChapterSix;

public class Hypotenuse {
    public static double calculatingHypotenuse(double adjacent, double opposite) {
        double hypotenuse;
        hypotenuse = Math.sqrt((Math.pow(adjacent, 2) + Math.pow(opposite, 2)));
        return hypotenuse;
    }

    public static void main(String[] args) {
        System.out.println(calculatingHypotenuse(3.0, 4.0));
        System.out.println(calculatingHypotenuse(5.0, 12.0));
        System.out.println(calculatingHypotenuse(8.0, 15.0));
    }
}
