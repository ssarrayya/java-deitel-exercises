package ChapterSix;

public class CircleArea {
    public static double circleArea(int radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println(circleArea(5));
    }
}
