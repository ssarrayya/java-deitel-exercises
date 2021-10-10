package extras;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int difference = Math.abs(primaryDiagonal - secondaryDiagonal);

        for(int row = 0; row < arr.size(); row++){
            for(int column = 0; column < arr.size(); column++){
                primaryDiagonal += arr.get(row).get(column);
                System.out.println(primaryDiagonal);
            }
        }

        for(int row = 0; row < arr.size(); row++){
            for(int column = arr.size() - 1; column >= 0; column--){
                secondaryDiagonal += arr.get(row).get(column);
                System.out.println(secondaryDiagonal);
            }
        }
        return difference;
    }
    public static void main(String [] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
