package hackerranksolutions.thirtydaysofcode.day8;

/*
Dictionaries and Maps
Link to problem: https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem?isFullScreen=true
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        String s;
        Map<String,String> myMap = new HashMap<String,String>();

        for( ; T >= 0; T--) {
            s = input.nextLine();
            String[] nameNum = s.split(" ");
            myMap.put(nameNum[0], nameNum[nameNum.length - 1]);
        }

        while(input.hasNextLine()) {
            String query = input.nextLine();
            if(myMap.containsKey(query)) {
                System.out.println(query + "=" + myMap.get(query));
            } else System.out.println("Not found");
        }
    }
}
