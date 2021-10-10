package extras;

import java.util.ArrayList;

public class NoDuplicates {
    static int[] integerArray = {1, 1, 2, 2, 3, 3};
    static ArrayList<Integer> newList = new ArrayList<>();

    public static void noDuplicateValue(int[] array) {
        newList.add(integerArray[0]);

        for (int i = 1; i < integerArray.length; i++) {
            boolean isDuplicate = false;
            for (Integer integer : newList) {
                if (integer == (integerArray[i])) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                newList.add(integerArray[i]);
            }
        }
        System.out.println(newList.size());
    }

    public static void displayArrayList() {
        for (Integer integer : newList) {
            System.out.println(integer);
        }
    }

    public static void main(String[] args) {
        noDuplicateValue(integerArray);
//        displayArrayList();
    }
}
