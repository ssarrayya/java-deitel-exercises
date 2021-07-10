package Extraa;

public class Intersection {
    static String[] strArr = {"1, 3, 4, 7, 13, 17", "1, 2, 4, 13, 15, 17"};

    public static void FindIntersection(String[] strArr) {
        String[] firstSetOfNumbers = strArr[0].split(",");
        String[] secondSetOfNumbers = strArr[1].split(",");
        StringBuilder commonElements = new StringBuilder();

        for (int i = 0; i < firstSetOfNumbers.length; i++) {
            for(int j = 0; j < secondSetOfNumbers.length; j++) {
                if (firstSetOfNumbers[i].equals(secondSetOfNumbers[j])) {
//                    commonElements.concat(firstSetOfNumbers[i]);
                    commonElements.append(firstSetOfNumbers[i]).append(",");
                    break;
                }
            }
        }
        System.out.println(commonElements);
    }

    public static void main(String[] args) {
        FindIntersection(strArr);
    }
}
