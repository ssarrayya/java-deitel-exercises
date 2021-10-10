package chapter7;

public class Practice4 {
    public static void main(String[] args) {
        // Set the 10 elements of integer array counts to zero
        int[] array = new int[10];

        //Add one to each of the 15 elements of integer array bonus
        int[] bonus = new int[15];
        for(int element: bonus){
            bonus[element] += 1;
        }

        //Display the five values of integer array bestScores in column format
        int[] bestScores = new int[5];

        for(int value: bestScores){
            System.out.println(bestScores[value]);
        }
    }
}
