package chapter15.filematchingwithmultipletransactions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileMatch {
    private static Scanner scannerA;
    private static Scanner scannerB;
    private static Formatter output;
    private static Formatter output2;
    private static int[] accNum;
    private static int[] trAccNum;
    private static String[] fullName;
    private static double[] accBal;
    private static double[] trAmnt;
    private static ArrayList<Double> trAmnt2 = new ArrayList<>();
    private static int lines = 0;
    private static int lines2 = 0;

    public static void openAccountFile() {
        Path path = Paths.get("src\\chapter15\\filematchingwithmultipletransactions\\files\\oldmast.txt");

        try {
            scannerA = new Scanner(path);
            lines = (int) Files.lines(path).count();
            accNum = new int[lines];
            fullName = new String[lines];
            accBal = new double[lines];
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void openTransactionRecordFile() {
        Path path = Paths.get("src\\chapter15\\filematchingwithmultipletransactions\\files\\trans.txt");
        try {
            scannerB = new Scanner(path);
            lines2 = (int) Files.lines(path).count();
            trAccNum = new int[lines2];
            trAmnt = new double[lines2];
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void readAccountRecords() {
        try {
            while(scannerA.hasNext()) {
                for (int i = 0; i < lines; i++) {
                    accNum[i] = scannerA.nextInt();
                    fullName[i] = scannerA.next() + " " + scannerA.next();
                    accBal[i] = scannerA.nextDouble();
                } 
            }
        } catch (NoSuchElementException | IllegalStateException elementException) {
            elementException.printStackTrace();
        }
    }

    /**
     * for sorted arrays with elements having same values
     * @param arr - the array we want to eliminate duplicate values from
     * @return arr - with no duplicate elements
     */
    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int j : arr) {
            set.add(j);
        }

        return set.stream().mapToInt(Number::intValue).toArray();
    }

    public static void readTrRecords() {
        try {
            while (scannerB.hasNext()) {
                for (int i = 0; i < lines2; i++) {
                    trAccNum[i] = scannerB.nextInt();
                    trAmnt[i] = scannerB.nextDouble();
                }
            }
        } catch (NoSuchElementException | IllegalStateException elementException) {
            elementException.printStackTrace();
        }
    }

    public static void compare() {
        try {
            output = new Formatter("src\\chapter15\\filematchingwithmultipletransactions\\files\\newmast.txt");
            output2 = new Formatter("src\\chapter15\\filematchingwithmultipletransactions\\files\\log.txt");

            System.out.println();
            int[] trAccNum2 = removeDuplicates(trAccNum);
            Arrays.sort(trAccNum2);
//            for(int x : trAccNum2) System.out.println(x);

            for (int i = 0; i < trAccNum.length; i++) {
                trAmnt2.add(trAmnt[i]);
                for (int j = i + 1; j < trAccNum.length; j++) {
                    if(trAccNum[j] == trAccNum[i]) {
                        trAmnt2.remove(trAmnt[i]);
                        trAmnt2.add(trAmnt[i] + trAmnt[i++]);
                    } else {
                        trAmnt2.add(trAmnt[i]);
                    }
                }
            }

            for (double x : trAmnt2) {
                System.out.print(x + " ");
            }

            if(lines == lines2) {
                for (int i = 0; i < lines; i++) {
                    for (int j = 0; j < lines2; j++) {
                        if (accNum[i] == trAccNum2[i]) {
                            output.format("%d %s %.2f%n", accNum[i], fullName[i], accBal[i] += trAmnt2.get(i));
                            break;
                        } else if (accNum[i] != trAccNum2[i]) {
                            output.format("%d %s %.2f%n", accNum[i], fullName[i], accBal[i]);
                            output2.format("%s %d%n", "Unmatched transaction record for account number",
                                    trAccNum2[i]);
                            break;
                        }
                    }
                }
            }
        } catch (FileNotFoundException | SecurityException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void closeFile() {
        if (output != null) output.close();
        if (output2 != null) output2.close();
        if (scannerA != null) scannerA.close();
        if (scannerB != null) scannerB.close();
    }

    public static void main(String[] args) {
        openAccountFile();
        openTransactionRecordFile();
        readAccountRecords();
        readTrRecords();
        compare();
        closeFile();
    }
}