package codewars;

public class Mumbling {
    public static String accum(String s) {
        char[] firstChars = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        int count = 1;
        sb.append(Character.toUpperCase(firstChars[0])).append("-");

        for(int i = 1; i < firstChars.length; i++) {
            sb.append(Character.toUpperCase(firstChars[i]));
            sb.append(Character.toString(firstChars[i]).repeat(count).toLowerCase());
            sb.append("-");
            count++;
        }return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
