package codewars;

public class VowelCount {
    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here
        char[] charArray = str.toCharArray();
        for(char c : charArray) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
