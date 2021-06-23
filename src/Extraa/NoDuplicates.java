package Extraa;

import java.util.ArrayList;

public class NoDuplicates {
    static int[] integerArray = {1, 1, 2, 2, 3, 3};
    static ArrayList<Integer> newArray = new ArrayList<>();

    public static void noDuplicateValue(int[] array) {
        newArray.add(integerArray[0]);

        for (int i = 1; i < integerArray.length; i++) {
            boolean isDuplicate = false;
            for (Integer integer : newArray) {
                if (integer == (integerArray[i])) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                newArray.add(integerArray[i]);
            }
        }
        System.out.println(newArray.size());
    }

    public static void displayArrayList() {
        for (Integer integer : newArray) {
            System.out.println(integer);
        }
    }

    public static void main(String[] args) {
        noDuplicateValue(integerArray);
//        displayArrayList();
    }
}
