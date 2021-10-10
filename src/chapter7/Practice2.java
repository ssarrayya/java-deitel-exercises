package chapter7;

public class Practice2 {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 3;
        int[][] table = new int[ARRAY_SIZE][ARRAY_SIZE];

        int ELEMENT_COUNTER = 0;
        for(int row = 0; row < table.length; row++) {
            for(int column = 0; column < table[row].length; column++) {
                ELEMENT_COUNTER++;
            }
        }
        System.out.println("The number of elements in table is " + ELEMENT_COUNTER);

        for(int x = 0; x < table.length; x++) {
            for(int y = 0; y < table[x].length; y++) {
                table[x][y] = x + y;
            }
        }

        for(int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                System.out.println(table[row][column]);
            }
        }
    }
}
