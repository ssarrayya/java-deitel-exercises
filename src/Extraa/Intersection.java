package Extraa;

public class Intersection {
    //Have the function FindIntersection(strArr) read the array of strings stored in strArr which will
    //contain 2 elements: the first element will represent a list of comma-separated numbers sorted in
    //ascending order, the second element will represent a second list of comma-separated numbers (also
    //sorted). Your goal is to return a comma-separated string containing the numbers that occur in
    //elements of strArr in sorted order. If there is no intersection, return the string false.

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
