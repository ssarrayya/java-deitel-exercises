package ChapterFive;

public class PythagoreanTriples {
    public static void main(String[] args) {
        System.out.println("Side 1,      Side2,      Hypotenuse");

        for(int side1 = 1; side1 <= 500; side1++) {
            for(int side2 = 1; side2 <= 500; side2++) {
                for(int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {
                    if(Math.pow(hypotenuse, 2) == Math.pow(side1, 2) + Math.pow(side2, 2)) {
                        System.out.printf("%d            %d           %d%n", side1, side2, hypotenuse);
                    }
                }
            }
        }
    }
}
